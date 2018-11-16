/*--------------- Process Response -----------------------

   * Here are the logic to make the Request and Get the Response for all the object request tha we has created
   * This Class is in charge to make the request in a background process.
   * The request return a response and we send it To onPostExecute
   * onPostExecute fill the listener Response
   * The listener response is chosen by a switch with count. count is init with their respective constructor.
   * We can use the response in the place we want.

  -----------------------------------------------------------
*/
package com.thegrafico.raul.evertectest.Response;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.thegrafico.raul.evertectest.ConectorListener.ACHResponseListener;
import com.thegrafico.raul.evertectest.ConectorListener.CheckoutPaymentListenerResponse;
import com.thegrafico.raul.evertectest.ConectorListener.CreditListenerResponse;
import com.thegrafico.raul.evertectest.ConectorListener.DebitListenerResponse;
import com.thegrafico.raul.evertectest.ConectorListener.OnlineListenerResponse;
import com.thegrafico.raul.evertectest.ConectorListener.TransactionSearchListenerResponse;
import com.thegrafico.raul.evertectest.ConectorListener.WalletListenerResponse;
import com.thegrafico.raul.evertectest.Modals.Request.ProcessACH_Request;
import com.thegrafico.raul.evertectest.Modals.Request.ProcessCheckoutPayment_Request;
import com.thegrafico.raul.evertectest.Modals.Request.ProcessCredit_Request;
import com.thegrafico.raul.evertectest.Modals.Request.ProcessDebit_Request;
import com.thegrafico.raul.evertectest.Modals.Request.ProcessOnline_Request;
import com.thegrafico.raul.evertectest.Modals.Request.ProcessTransactionSearch_Request;
import com.thegrafico.raul.evertectest.Modals.Request.ProcessWalletTransaction_Request;
import com.thegrafico.raul.evertectest.Modals.Response.ResponseACH;
import com.thegrafico.raul.evertectest.Modals.Response.ResponseCheckoutPayment;
import com.thegrafico.raul.evertectest.Modals.Response.ResponseCredit;
import com.thegrafico.raul.evertectest.Modals.Response.ResponseDebit;
import com.thegrafico.raul.evertectest.Modals.Response.ResponseOnlineResponse;
import com.thegrafico.raul.evertectest.Modals.Response.ResponseTransactionSearch;
import com.thegrafico.raul.evertectest.Modals.Response.ResponseWalletTransaction;
import com.thegrafico.raul.evertectest.Request.MakeRequest;

public class ProcessResponse extends AsyncTask<String, Void, String> {

    //GENERAL OBJECT
    private Object request;

    //LISTENER
    private DebitListenerResponse debitListener;
    private CreditListenerResponse creditListener;
    private ACHResponseListener achListener;
    private WalletListenerResponse walletListener;
    private CheckoutPaymentListenerResponse checkoutListener;
    private OnlineListenerResponse onlineListener;
    private TransactionSearchListenerResponse transactionListener;


    //Count: use to know what constructor was call.
    private int count = 0;
    //to convert the Object into a JSON
    private Gson gson = new Gson();

    //--------------------------------CONSTRUCTORS---------------------------------------
    //Process Debit
    public ProcessResponse(ProcessDebit_Request request, DebitListenerResponse downloadComplete){
        //COUNT FOR SWITCH
        count = 1;

        this.request = request;
        //responseListener

        //init listener Debit Response
        debitListener = downloadComplete;
    }

    //Process Credit
    public ProcessResponse(ProcessCredit_Request request, CreditListenerResponse downloadComplete) {

        //count 2, init the Request and set the URL
        count = 2;
        //init the request
        this.request = request;
        //init listener Credit
        creditListener = downloadComplete;

    }

    //Process ACH
    public ProcessResponse(ProcessACH_Request request, ACHResponseListener downloadComplete) {

        count = 3;
        this.request = request;
        achListener = downloadComplete;

    }

    //Process WalletTransaction
    public ProcessResponse(ProcessWalletTransaction_Request request, WalletListenerResponse downloadComplete) {

        count = 4;
        this.request = request;
        walletListener = downloadComplete;

    }

    //Process CheckoutPayment
    public ProcessResponse(ProcessCheckoutPayment_Request request, CheckoutPaymentListenerResponse downloadComplete) {

        count = 5;
        this.request = request;
        checkoutListener = downloadComplete;

    }

    //Process Online
    public ProcessResponse(ProcessOnline_Request request, OnlineListenerResponse downloadComplete) {

        count = 6;
        this.request = request;
        onlineListener = downloadComplete;

    }

    //Process Transaction Search
    public ProcessResponse(ProcessTransactionSearch_Request request, TransactionSearchListenerResponse downloadComplete) {

        count = 7;
        this.request = request;
        transactionListener = downloadComplete;

    }
    //-------------------------------------------------------------------------------------------------


        //---------------Thread background Process-------------------

    //this function make the request in background, so the main thread is not interrupt
    @Override
    protected String doInBackground(String... strings) {

        try{ //here the request is start to get the data from a web server
            return MakeRequest.getDataFromRequest(gson.toJson(request), count);
        }catch (Exception e){
            Log.d("Error", "Download can't be completed\n" + e.getMessage());
        }
        return null;
    }

    //this function only run once the doInBackground is completed. Here we fill up the Response Listener
    @Override
    protected void onPostExecute(String s) {
        try{ //execute this function before the download is completed
            chose(count, s);
        }catch (Exception e){
            Log.d("Error", e.getMessage());
        }
    }

    //------------------END Thread Process-----------------------

    //-------------------CHOSE ELEMENT For the Response------------------------------
    private void chose(int count, String s){
        //with the count we know what constructor was call an then we can choose the response for that constructor
        switch (count){
            case 1: //Debit Transaction
                ResponseDebit resp1 = gson.fromJson(s, ResponseDebit.class);
                debitListener.downloadCompleted(s, resp1);
                break;
            case 2: //Credit Transaction
                ResponseCredit resp2 = gson.fromJson(s, ResponseCredit.class);
                creditListener.downloadCompleted(s, resp2);
                break;
            case 3: //ACH
                ResponseACH resp3 = gson.fromJson(s, ResponseACH.class);
                achListener.downloadCompleted(s, resp3);
            break;
            case 4: //Wallet Transaction
                ResponseWalletTransaction resp4 = gson.fromJson(s, ResponseWalletTransaction.class);
                walletListener.downloadCompleted(s, resp4);
                break;
            case 5: //Checkout Payment
                ResponseCheckoutPayment resp5 = gson.fromJson(s, ResponseCheckoutPayment.class);
                checkoutListener.downloadCompleted(s, resp5);
                break;
            case 6: //Online Transaction
                ResponseOnlineResponse resp6 = gson.fromJson(s, ResponseOnlineResponse.class);
                onlineListener.downloadCompleted(s, resp6);
                break;
            case 7: //Search Transaction
                ResponseTransactionSearch resp7 = gson.fromJson(s, ResponseTransactionSearch.class);
                transactionListener.downloadCompleted(s, resp7);
                break;
        }
    }
    //-------------------END CHOSE--------------------------------------------
}


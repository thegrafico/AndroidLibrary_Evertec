/*--------------- MAKE REQUEST -----------------------

   * Here are the logic to make the request for all the object request  tha we has created
   * All of the object request make a simple request: 'POST'.

  -----------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
//class name
public class MakeRequest {

    /*
        *static methods to make request: receive 'dataToMakeRequest' and 'choose'
        * dataToMakeRequest is a Json Object that we send here with data to make the request
        * choose is an option to know what object was called and set the proper URL where data will be send.
    */

    static public String getDataFromRequest(String dataToMakeRequest, int choose){

        //Object Connection
        HttpURLConnection urlConnection = null;
        try{
            //set the URL with object URL (chooseURL is a function to choose the proper URL)
            URL url = new URL(chooseURL(choose));

            //Object Connection and open the connection
            urlConnection = (HttpURLConnection) url.openConnection();

            //SetUp the request
            urlConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            urlConnection.setRequestProperty("Accept", "application/json");
            urlConnection.setDoOutput(true);
            urlConnection.setRequestMethod("POST");

            //Open Connection
            urlConnection.connect();

            //Here que are setup the data(The request JSOn Object we gonna send
            OutputStream os = urlConnection.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");

            //sending request (data)
            osw.write(dataToMakeRequest);

            //clean/close sending data
            osw.flush();
            osw.close();

            //Here we get the response from the web service  or where we are making the request
            BufferedReader streamReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));

            //StringBuilding to append string in a clean a fast way
            StringBuilder responseStrBuilder = new StringBuilder();
            String inputStr;

            //while there is data to read, append the response into my stringBuilder
            while ((inputStr = streamReader.readLine()) != null)
                responseStrBuilder.append(inputStr);

            //close de streamReader
            streamReader.close();

            //returns the Response in json object format
            return responseStrBuilder.toString();

            //error handle
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //close the urlConnection
            if (urlConnection != null){
                urlConnection.disconnect();
            }
        }

        //if everything go well, never end in this point
        return null;
    }


    //private function to choose what URL call
    private static String chooseURL(int choose){
        String URL;

        switch (choose){
            case 1: //Process Debit Transaction
                URL = "http://192.168.43.118:2000/processDebit/";
                break;
            case 2: //Process Credit Transaction
                URL = "http://192.168.43.118:2000/processCredit/";

                break;
            case 3: //Process ACH Transaction
                URL = "http://192.168.43.118:2000/processACH/";
                break;
            case 4: //Process Wallet Transaction Transaction
                URL = "http://192.168.43.118:2000/processWallet/";
                break;
            case 5: //Process Checkout Payment Transaction
                URL = "http://192.168.43.118:2000/processCheckout/";
                break;
            case 6: //Process Online Transaction
                URL = "http://192.168.43.118:2000/processOnline/";
                break;
            case 7: //Process Transaction Search Transaction
                URL = "http://192.168.43.118:2000/processTransactionSearch/";
                break;
            default:
                URL = null;
        }

        return URL;
    }
}

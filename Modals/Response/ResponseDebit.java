/*--------------- Debit  Transaction Response -----------------------

   * Here are the variables that we get from the response for Debit Transaction
   * The listener return this Response object and you can access to the variables from it.

  -----------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Modals.Response;

import com.thegrafico.raul.evertectest.Modals.Response.inheritance.DataResponse;

//Extends From Data Response
public class ResponseDebit extends DataResponse {

    //variables Response
    private String
        postingdate     = null,
        systemTrace     = null,
        trxDateTime     = null;

    //constructor
    public ResponseDebit(){}

    //to String to see the data that we get from the response
    @Override
    public String toString() {
        return   "ResponseProcessDebit{ " +
                super.toString() + //call the super to get the toString from it
                ", postingdate='" + postingdate + '\'' +
                ", systemTrace='" + systemTrace + '\'' +
                ", trxDateTime='" + trxDateTime + '\'' +
                '}';
    }

    //-----------------GETTERS and SETTERS-------------------------
    public String getPostingdate() {
        return postingdate;
    }

    public void setPostingdate(String postingdate) {
        this.postingdate = postingdate;
    }

    public String getSystemTrace() {
        return systemTrace;
    }

    public void setSystemTrace(String systemTrace) {
        this.systemTrace = systemTrace;
    }

    public String getTrxDatetime() {
        return trxDateTime;
    }

    public void setTrxDatetime(String trxDatetime) {
        this.trxDateTime = trxDatetime;
    }


}

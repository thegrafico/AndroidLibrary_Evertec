/*--------------- Credit Transaction Response -----------------------

   * Here are the variables that we get from the response for Credit Transaction
   * The listener return this Response object and you can access to the variables from it.

  -----------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Modals.Response;

import com.thegrafico.raul.evertectest.Modals.Response.inheritance.DataResponse;

import java.io.Serializable;

//Extends From Data Response Object
public class ResponseCredit extends DataResponse implements Serializable {

//variables Response
private String
        postingdate     = null,
        systemTrace     = null,
        trxDatetime     = null,
        trxoper         = null;

    //constructor
    public ResponseCredit(){}

    //To String to see the data we get from the request
    @Override
    public String toString() {
        return  "ResponseProcessCredit{ " +
                 super.toString() + //call the super.toString to get the data from the inheritance
                "ResponseProcessCredit{" +
                "postingdate='" + postingdate + '\'' +
                ", systemTrace='" + systemTrace + '\'' +
                ", trxDatetime='" + trxDatetime + '\'' +
                ", trxoper='" + trxoper + '\'' +
                '}';
    }

    //-------------------------GETTERS and SETTERS---------------------------------
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
        return trxDatetime;
    }

    public void setTrxDatetime(String trxDatetime) {
        this.trxDatetime = trxDatetime;
    }

    public String getTrxoper() {
        return trxoper;
    }

    public void setTrxoper(String trxoper) {
        this.trxoper = trxoper;
    }
}

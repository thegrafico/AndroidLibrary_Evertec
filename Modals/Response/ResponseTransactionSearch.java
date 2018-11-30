/*--------------- Search Transaction Response -----------------------

   * Here are the variables that we get from the response for Search Transaction
   * The listener return this Response object and you can access to the variables from it.

  -----------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Modals.Response;

import java.io.Serializable;

//class
public class ResponseTransactionSearch implements Serializable {

    //Variables Response
    private String
                    authNumber      = null,
                    batchNumber      = null,
                    merchantid      = null,
                    rCode           = null,
                    rMsg            = null,
                    refNumber       = null,
                    requestID      = null,
                    statusCode      = null,
                    trxDateTime     = null,
                    trxID           = null,
                    trxoper         = null,
                    trxtype         = null,
                    responseValidated = null;
    //Constructor
    public ResponseTransactionSearch(){
        super();
    }

    //To String to see the data we get from the response
    @Override
    public String toString() {
        return "ResponseTransactionSearch{" +
                "authNumber='" + authNumber + '\'' +
                ", bathNumber='" + batchNumber + '\'' +
                ", merchantid='" + merchantid + '\'' +
                ", rCode='" + rCode + '\'' +
                ", rMsg='" + rMsg + '\'' +
                ", refNumber='" + refNumber + '\'' +
                ", resquestID='" + requestID + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", trxDateTime='" + trxDateTime + '\'' +
                ", trxID='" + trxID + '\'' +
                ", trxoper='" + trxoper + '\'' +
                ", trxtype='" + trxtype + '\'' +
                ", Validated? ='" + responseValidated+ '\'' +
                '}';
    }

    //------------------------GETTERS and SETTERS----------------------------
    public String getAuthNumber() {
        return authNumber;
    }

    public void setAuthNumber(String authNumber) {
        this.authNumber = authNumber;
    }

    public String getbatchNumber() {
        return batchNumber;
    }

    public void setbatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    public String getrCode() {
        return rCode;
    }

    public void setrCode(String rCode) {
        this.rCode = rCode;
    }

    public String getrMsg() {
        return rMsg;
    }

    public void setrMsg(String rMsg) {
        this.rMsg = rMsg;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getTrxDateTime() {
        return trxDateTime;
    }

    public void setTrxDateTime(String trxDateTime) {
        this.trxDateTime = trxDateTime;
    }

    public String getTrxID() {
        return trxID;
    }

    public void setTrxID(String trxID) {
        this.trxID = trxID;
    }

    public String getTrxoper() {
        return trxoper;
    }

    public void setTrxoper(String trxoper) {
        this.trxoper = trxoper;
    }

    public String getTrxtype() {
        return trxtype;
    }

    public void setTrxtype(String trxtype) {
        this.trxtype = trxtype;
    }

    public String getResponseValidated() {return responseValidated;}

    public void setResponseValidated(String responseValidated) {this.responseValidated = responseValidated;}
}

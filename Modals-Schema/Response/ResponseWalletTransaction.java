/*--------------- Wallet Transaction Response -----------------------

   * Here are the variables that we get from the response for Wallet Transaction
   * The listener return this Response object and you can access to the variables from it.

  -----------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Modals.Response;

import java.io.Serializable;

//class
public class ResponseWalletTransaction implements Serializable {

    //Variables Response
    private String
            authNumber  = null,
            batchNumber  = null,
            merchantid  = null,
            postingdate = null,
            rCode       = null,
            rMsg        = null,
            refNumber   = null,
            requestID   = null,
            systemTrace = null,
            trxDataTime = null,
            trxID       = null,
            trxoper     = null,
            trxtype     = null;

    //constructor
    public ResponseWalletTransaction(){
        super();
    }

    //To String to see the data we get from the response
    @Override
    public String toString() {
        return "ResponseWalletTransaction{" +
                "authNumber='" + authNumber + '\'' +
                ", bachNumber='" + batchNumber + '\'' +
                ", merchantid='" + merchantid + '\'' +
                ", postingdate='" + postingdate + '\'' +
                ", rCode='" + rCode + '\'' +
                ", rMgs='" + rMsg + '\'' +
                ", refNumber='" + refNumber + '\'' +
                ", requestID='" + requestID + '\'' +
                ", systemTrace='" + systemTrace + '\'' +
                ", trxDataTime='" + trxDataTime + '\'' +
                ", trxID='" + trxID + '\'' +
                ", trxoper='" + trxoper + '\'' +
                ", trxtype='" + trxtype + '\'' +
                '}';
    }

    //------------------------GETTERS and SETTERS----------------------------
    public String getAuthNumber() {
        return authNumber;
    }

    public void setAuthNumber(String authNumber) {
        this.authNumber = authNumber;
    }

    public String getBachNumber() {
        return batchNumber;
    }

    public void setBachNumber(String bachNumber) {
        this.batchNumber = bachNumber;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    public String getPostingdate() {
        return postingdate;
    }

    public void setPostingdate(String postingdate) {
        this.postingdate = postingdate;
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

    public String getSystemTrace() {
        return systemTrace;
    }

    public void setSystemTrace(String systemTrace) {
        this.systemTrace = systemTrace;
    }

    public String getTrxDataTime() {
        return trxDataTime;
    }

    public void setTrxDataTime(String trxDataTime) {
        this.trxDataTime = trxDataTime;
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



}

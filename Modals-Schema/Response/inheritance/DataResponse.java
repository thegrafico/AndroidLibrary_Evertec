/*This is the super constructor, Some classes inheritance from this one.*/

package com.thegrafico.raul.evertectest.Modals.Response.inheritance;

import java.io.Serializable;

//Implements Serializable for passing data via Intent in  easy and fast way
public class DataResponse implements Serializable {

    //we get this data from the response and we can use it on all class that inheritance from this one.
    private String
        authNumber      = null,
        batchNumber     = null,
        merchantid      = null,
        rCode           = null,
        rMsg            = null,
        refNumber       = null,
        requestID       = null,
        trxID           = null,
        trxtype         = null;

    //constructor
    public DataResponse(){}

    //to String to see if we get te data.
    @Override
    public String toString() {
        return
                "authNumber='" + authNumber + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", merchantid='" + merchantid + '\'' +
                ", rCode='" + rCode + '\'' +
                ", rMsg='" + rMsg + '\'' +
                ", refNumber='" + refNumber + '\'' +
                ", requestID='" + requestID + '\'' +
                ", trxID='" + trxID + '\'' +
                ", trxtype='" + trxtype + '\'' +
                '}';
    }

    //-----------------GETTERS and SETTERS-------------------------
    public String getAuthNumber() {
        return authNumber;
    }

    public void setAuthNumber(String authNumber) {
        this.authNumber = authNumber;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
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

    public String getTrxID() {
        return trxID;
    }

    public void setTrxID(String trxID) {
        this.trxID = trxID;
    }

    public String getTrxtype() {
        return trxtype;
    }

    public void setTrxtype(String trxtype) {
        this.trxtype = trxtype;
    }
}

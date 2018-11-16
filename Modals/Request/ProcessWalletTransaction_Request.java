/*--------------- Wallet Process Request -----------------------

   * Here are the variables that Wallet Process need to make the request.
   * You need to use this object to make a request for Wallet Process

  -----------------------------------------------------------
*/
package com.thegrafico.raul.evertectest.Modals.Request;

//class
public class ProcessWalletTransaction_Request {

    //variables to make request
    private String  username        = null,
                    password        = null,
                    accountNumber   = null,
                    trxID           = null,
                    trxAmout        = null,
                    refNumber       = null,
                    trxDescription  = null,
                    filler1         = null,
                    trxOper         = null;

    //constructor
    public ProcessWalletTransaction_Request(){super();}

    //-----------------------GETTERS and SETTERS---------------------
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTrxID() {
        return trxID;
    }

    public void setTrxID(String trxID) {
        this.trxID = trxID;
    }

    public String getTrxAmout() {
        return trxAmout;
    }

    public void setTrxAmout(String trxAmout) {
        this.trxAmout = trxAmout;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getTrxDescription() {
        return trxDescription;
    }

    public void setTrxDescription(String trxDescription) {
        this.trxDescription = trxDescription;
    }

    public String getFiller1() {
        return filler1;
    }

    public void setFiller1(String filler1) {
        this.filler1 = filler1;
    }

    public String getTrxOper() {
        return trxOper;
    }

    public void setTrxOper(String trxOper) {
        this.trxOper = trxOper;
    }
}

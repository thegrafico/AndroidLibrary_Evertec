/*--------------- Search Process Request -----------------------

   * Here are the variables that Search Process need to make the request.
   * You need to use this object to make a request for Search Process

  -----------------------------------------------------------
*/
package com.thegrafico.raul.evertectest.Modals.Request;

//class
public class ProcessTransactionSearch_Request {

    //variables to make request
    private String
                    username    = null,
                    password    = null,
                    accountID   = null,
                    trxID       = null,
                    trxAmount   = null;

    //constructor
    public ProcessTransactionSearch_Request(){
        super();
    }

    //---------------------GETTERS and SETTERS-----------------------
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

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getTrxID() {
        return trxID;
    }

    public void setTrxID(String trxID) {
        this.trxID = trxID;
    }

    public String getTrxAmount() {
        return trxAmount;
    }

    public void setTrxAmount(String trxAmount) {
        this.trxAmount = trxAmount;
    }
}

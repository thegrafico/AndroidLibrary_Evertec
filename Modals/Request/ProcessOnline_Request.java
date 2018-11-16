/*--------------- Online Process Request -----------------------

   * Here are the variables that Online Transaction need to make the request.
   * You need to use this object to make a request for Online  Process

  -----------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Modals.Request;

//extends from ProcessTransactionSearch
public class ProcessOnline_Request extends ProcessTransactionSearch_Request {

    //variables to make request
    private String
            paymentMethod       = null,
            trxDescription      = null,
            authNumber          = null,
            confNumber          = null,
            filler              = null;

    //constructor
    public ProcessOnline_Request(){}

    //---------------GETTERS and SETTERS-------------------------
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTrxDescription() {
        return trxDescription;
    }

    public void setTrxDescription(String trxDescription) {
        this.trxDescription = trxDescription;
    }

    public String getAuthNumber() {
        return authNumber;
    }

    public void setAuthNumber(String authNumber) {
        this.authNumber = authNumber;
    }

    public String getConfNumber() {
        return confNumber;
    }

    public void setConfNumber(String confNumber) {
        this.confNumber = confNumber;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }
}

/*--------------- Checkout Payment  Response -----------------------

   * Here are the variables that we get from the response for Checkout Payment
   * The listener return this Response object and you can access to the variables from it.

  -----------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Modals.Response;
//class
public class ResponseCheckoutPayment {

    //Variables Response
    private String
                    rCode = null,
                    rMsg  = null,
                    requestID = null;

    //constructor
    public ResponseCheckoutPayment(){super();}

    //to String to see the data that we get from the response
    @Override
    public String toString() {
        return "ResponseCheckoutPayment{ " +
                "rCode='" + rCode + '\'' +
                ", rMsg='" + rMsg + '\'' +
                ", requestID='" + requestID + '\'' +
                '}';
    }

    //-------------------GETTERS and SETTERS----------------
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

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

}

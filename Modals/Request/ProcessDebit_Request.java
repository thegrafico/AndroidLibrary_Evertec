/*--------------- Debit Process Request -----------------------

   * Here are the variables that Process Debit needed to make the request.
   * You need to use this object to make a request for Debit Process

  -----------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Modals.Request;

import com.thegrafico.raul.evertectest.Modals.Request.InheritanceData.Data;

//extends from Data
public class ProcessDebit_Request extends Data {

    //Variables to make request
    private String
            cardNumber      = null,
            expDate         = null,
            pinblock        = null;

    //CONSTRUCTOR
    public ProcessDebit_Request() {}

    //-------------------------GETTERS and SETTERS-------------------------
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getPinblock() {
        return pinblock;
    }

    public void setPinblock(String pinblock) {
        this.pinblock = pinblock;
    }
}

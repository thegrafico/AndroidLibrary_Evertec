/*--------------- ACH Process Response -----------------------

   * Here are the variables that we get from the response for ACH Transaction
   * The listener return this Response object and you can access to the variables from it.

  -----------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Modals.Response;

import com.thegrafico.raul.evertectest.Modals.Response.inheritance.DataResponse;

//extends From DataResponse
public class ResponseACH extends DataResponse {

    //variable Response
    private String trxOper = null;

    //toString to see what data we get from this object
    @Override
    public String toString() {
        return "ResponseProcessACH{ " +
                super.toString() + //call the Father.toString and concatenate with toString of this class.
                "trxOper='" + trxOper + '\'' +
                '}';
    }

    //-----------------GETTERS and SETTER
    public String getTrxOper() {
        return trxOper;
    }

    public void setTrxOper(String trxOper) {
        this.trxOper = trxOper;
    }
}

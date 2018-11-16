/*--------------- ACH Process Request -----------------------

   * Here are the variables that ACH need to make the request.
   * You need to use this object to make a request for ACH

  -----------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Modals.Request;

import com.thegrafico.raul.evertectest.Modals.Request.InheritanceData.Data;

//extends from Data
public class ProcessACH_Request extends Data {

    //variables to make request
    private String
        backAccount     = null,
        routing         = null,
        accType         = null;

    //constructor
    public ProcessACH_Request(){super();}

    //---------------------GETTERS and SETTERS---------------------------
    public String getBackAccount() {
        return backAccount;
    }

    public void setBackAccount(String backAccount) {
        this.backAccount = backAccount;
    }

    public String getRouting() {
        return routing;
    }

    public void setRouting(String routing) {
        this.routing = routing;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
}

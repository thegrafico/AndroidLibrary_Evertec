/*--------------- Online Transaction Response -----------------------

   * Here are the variables that we get from the response for Online Transaction
   * The listener return this Response object and you can access to the variables from it.

  -----------------------------------------------------------
*/

package com.thegrafico.raul.evertectest.Modals.Response;

import java.io.Serializable;

//class
public class ResponseOnlineResponse implements Serializable {

    //variables Response
    private String
        code        = null,
        message     = null,
        requestID   = null;

    //constructor
    public ResponseOnlineResponse(){}

    //To String to see the data we get from the response
    @Override
    public String toString() {
        return "ResponseProcessOnlineResponse{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", requestId='" + requestID + '\'' +
                '}';
    }

    //------------------------------GETTERS and SETTERS--------------------------
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return requestID;
    }

    public void setRequestId(String requestId) {
        this.requestID = requestId;
    }
}

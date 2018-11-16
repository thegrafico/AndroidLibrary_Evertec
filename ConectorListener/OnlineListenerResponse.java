/*Listener to get the response for Online transaction */
package com.thegrafico.raul.evertectest.ConectorListener;

import com.thegrafico.raul.evertectest.Modals.Response.ResponseOnlineResponse;

public interface OnlineListenerResponse {

    void downloadCompleted(String result, ResponseOnlineResponse response);

}

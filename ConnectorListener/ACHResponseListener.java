/*Listener to get the response for ACH Transaction */
package com.thegrafico.raul.evertectest.ConectorListener;

import com.thegrafico.raul.evertectest.Modals.Response.ResponseACH;

public interface ACHResponseListener {

    void downloadCompleted(String result, ResponseACH response);

}

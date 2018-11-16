/*Listener to get the response for Checkout Payment transaction */

package com.thegrafico.raul.evertectest.ConectorListener;

import com.thegrafico.raul.evertectest.Modals.Response.ResponseCheckoutPayment;

public interface CheckoutPaymentListenerResponse {

    void downloadCompleted(String result, ResponseCheckoutPayment response);

}

/*Listener to get the response for Wallet Transaction git*/
package com.thegrafico.raul.evertectest.ConectorListener;

import com.thegrafico.raul.evertectest.Modals.Response.ResponseWalletTransaction;

public interface WalletListenerResponse {

    void downloadCompleted(String result, ResponseWalletTransaction response);
}

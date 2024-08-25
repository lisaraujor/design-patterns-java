package com.java.designpatterns.adapter.paypal;

import com.java.designpatterns.adapter.utils.Token;

public class Paypal implements InterfacePaypalPayments {

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayments() {
        this.token = authToken();
        System.out.println("Send payments with Paypal.");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Receiving payments with Paypal.");
    }
    
}

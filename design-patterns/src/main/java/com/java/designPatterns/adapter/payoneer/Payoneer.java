package com.java.designpatterns.adapter.payoneer;

import com.java.designpatterns.adapter.utils.Token;

public class Payoneer implements InterfacePayoneerPayments {

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayments() {
        System.out.println("Sending payment with Payoneer");
    }

    @Override
    public void receivePayments() {
        System.out.println("Receiving payment with Payoneer");
    }

}

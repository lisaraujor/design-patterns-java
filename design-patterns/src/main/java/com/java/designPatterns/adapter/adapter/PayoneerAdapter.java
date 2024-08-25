package com.java.designpatterns.adapter.adapter;

import com.java.designpatterns.adapter.payoneer.Payoneer;
import com.java.designpatterns.adapter.paypal.InterfacePaypalPayments;
import com.java.designpatterns.adapter.utils.Token;

public class PayoneerAdapter implements InterfacePaypalPayments{
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer){
        this.payoneer = payoneer;
        System.out.println("Adapting Payoneer using Paypal methods");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayments() {
        this.payoneer.sendPayments();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayments();
    }

}

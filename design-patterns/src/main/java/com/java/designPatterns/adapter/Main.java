package com.java.designpatterns.adapter;

import com.java.designpatterns.adapter.adapter.PayoneerAdapter;
import com.java.designpatterns.adapter.payoneer.Payoneer;
import com.java.designpatterns.adapter.paypal.InterfacePaypalPayments;

public class Main {
    public static void main(String[] args) {
        
        // InterfacePaypalPayments payment = new Paypal();
        // payment.paypalPayments();
        // payment.paypalReceive();

        InterfacePaypalPayments payment = new PayoneerAdapter(new Payoneer());
        payment.paypalPayments();
        payment.paypalReceive();
    }
}

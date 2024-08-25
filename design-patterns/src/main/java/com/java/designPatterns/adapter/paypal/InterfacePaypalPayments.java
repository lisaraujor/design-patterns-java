package com.java.designpatterns.adapter.paypal;

import com.java.designpatterns.adapter.utils.Token;

public interface InterfacePaypalPayments {

    Token authToken();
    void paypalPayments();
    void paypalReceive();
}

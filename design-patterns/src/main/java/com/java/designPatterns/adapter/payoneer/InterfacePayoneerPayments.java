package com.java.designpatterns.adapter.payoneer;

import com.java.designpatterns.adapter.utils.Token;

public interface InterfacePayoneerPayments {
    Token authToken();
    void sendPayments();
    void receivePayments();
}

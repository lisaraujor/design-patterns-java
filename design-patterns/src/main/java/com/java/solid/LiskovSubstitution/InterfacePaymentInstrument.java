package com.java.solid.liskovsubstitution;

public interface InterfacePaymentInstrument {
    void validate() throws Exception;
    void collectPayment();
}

package com.java.solid.LiskovSubstitution;

public interface InterfacePaymentInstrument {
    void validate() throws Exception;
    void collectPayment();
}

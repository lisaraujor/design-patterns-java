package com.java.solid.LiskovSubstitution;

abstract public class NubankCard implements InterfacePaymentInstrument {

    @Override
    public void validate() throws Exception {
        // Basic validation here
    }

    @Override
    public void collectPayment() {
        System.out.println("Payment made successfully!");
    }
}
package com.java.solid.LiskovSubstitution;

public class CreditCard extends NubankCard {

    @Override
    public void validate() throws Exception {

        System.out.println("Validating credit card limit...");
        System.out.println("Available limit on credit card! :)");
    }
}

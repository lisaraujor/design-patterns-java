package com.java.solid.liskovsubstitution;

public class DebitCard extends NubankCard {
    
    @Override
    public void validate() throws Exception {

        System.out.println("Validating balance...");
        System.out.println("Available balance! :)");
    }
}

package com.java.solid.liskovsubstitution;

public class NubankRewards implements InterfacePaymentInstrument {
    
    @Override
    public void validate() throws Exception {
        // Basic validations here
        System.out.println("Rewards available!");
    }

    @Override
    public void collectPayment() {
        System.out.println("Payment made successfully!");
        System.out.println("Points credited to the Rewards Program :)");
    }
}

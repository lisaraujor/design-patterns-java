package com.java.solid.DependencyInversion;

public class Main {
    
    public static void main(String[] args) {
       PaymentFactory payment = new PaymentFactory();
       payment.pay(15);
    }
}

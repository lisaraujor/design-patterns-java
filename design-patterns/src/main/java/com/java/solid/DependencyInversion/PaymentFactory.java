package com.java.solid.DependencyInversion;

public class PaymentFactory {
    public void pay(int productId) {
        InterfaceDbProduct dbProduct = DbProductFactory.create(DbEnum.MONGODB);
        String product = dbProduct.getProductById(productId);
        System.out.println(product);
    }
}

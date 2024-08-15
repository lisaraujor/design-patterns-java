package com.java.solid.DependencyInversion;

public class MongoDBProduct implements InterfaceDbProduct {
    
    public String getProductById(int id){
        return "MongoDB: Product " + id + " found successfully.";
    }
}
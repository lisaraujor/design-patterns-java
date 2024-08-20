package com.java.solid.dependencyinversion;

public class MySQLProduct implements InterfaceDbProduct {
    
    public String getProductById(int id){
        return "MySQL: Product " + id + " found successfully.";
    }
}

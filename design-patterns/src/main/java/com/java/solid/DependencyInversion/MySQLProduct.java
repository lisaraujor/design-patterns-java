package com.java.solid.DependencyInversion;

public class MySQLProduct implements InterfaceDbProduct {
    
    public String getProductById(int id){
        return "MySQL: Product " + id + " found successfully.";
    }
}

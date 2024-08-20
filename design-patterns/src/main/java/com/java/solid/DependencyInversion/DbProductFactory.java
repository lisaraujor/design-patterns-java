package com.java.solid.dependencyinversion;

public class DbProductFactory {
    
    public static InterfaceDbProduct create(DbEnum dbType) {
        if (dbType == DbEnum.MYSQL) {
            return new MySQLProduct();
        } else {
            return new MongoDBProduct();
        }

    }
}

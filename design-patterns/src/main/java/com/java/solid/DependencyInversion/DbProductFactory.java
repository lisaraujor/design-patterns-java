package com.java.solid.DependencyInversion;

public class DbProductFactory {
    
    public static InterfaceDbProduct create(DbEnum dbType) {
        if (dbType == DbEnum.MYSQL) {
            return new MySQLProduct();
        } else {
            return new MongoDBProduct();
        }

    }
}

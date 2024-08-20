package com.java.solid.interfacesegregation;

public class MainVehicle {

    private static String type;

    public static void main(String[] args) {
        
        type = "Caar";

        if (type == "Car"){
            Car car = new Car("yellow", "2020", 1.5, 4);
        } else {
            Motorcycle motorcycle = new Motorcycle("black", "2015", 250);
        }

    }
}

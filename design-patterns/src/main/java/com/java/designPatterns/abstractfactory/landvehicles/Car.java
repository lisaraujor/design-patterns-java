package com.java.designpatterns.abstractfactory.landvehicles;

public class Car implements InterfaceLandVehicle {
    
    @Override
    public void startRoute() {
        System.out.println("Requesting a car...");
        getCargo();
        System.out.println("Starting the journey...\n");
    }

    @Override
    public void getCargo() {
        System.out.println("Picked up the passengers, everything is ready.");
    }
}

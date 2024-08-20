package com.java.designpatterns.abstractfactory.landvehicles;

public class Motorcycle implements InterfaceLandVehicle {
    
    @Override
    public void startRoute() {
        System.out.println("Requesting a motorcycle...");
        getCargo();
        System.out.println("Starting delivery...\n");
    }

    @Override
    public void getCargo() {
        System.out.println("Picked up the order, everything is ready.");
    }
}

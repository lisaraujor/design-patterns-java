package com.java.designPatterns.FactoryMethod.vehicles;

public class Car implements InterfaceVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Starting the journey...");
    }

    @Override
    public void getCargo() {
        System.out.println("Picked up the passengers, everything is ready.");
    }

}

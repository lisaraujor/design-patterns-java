package com.java.designPatterns.FactoryMethod.vehicles;

public class Motorcycle implements InterfaceVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Starting delivery...");
    }

    @Override
    public void getCargo() {
        System.out.println("Picked up the order, everything is ready.");
    }

}

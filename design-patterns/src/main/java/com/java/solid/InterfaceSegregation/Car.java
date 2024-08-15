package com.java.solid.InterfaceSegregation;

public class Car implements InterfaceVehicle, InterfaceVehicleCar {

    private String color;
    private String year;
    private double engine;
    private int seats;
    
    public Car(String color, String year, double engine, int seats) {
        configureCar(color, year, engine, seats);
    }

    @Override // InterfaceVehicleCar
    public void configureCar(String color, String year, double engine, int seats) {
        System.out.println("Configuring " + color + " car, from " + year + " with " + engine + " engine and " + seats + " seats.");
        startVehicle();
    }

    @Override // InterfaceVehicle
    public void startVehicle() {
        System.out.println("Starting engines... ");
    }

    
}

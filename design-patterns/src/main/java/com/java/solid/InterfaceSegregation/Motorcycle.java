package com.java.solid.interfacesegregation;

public class Motorcycle implements InterfaceVehicle, InterfaceVehicleMotorcycle{
    
    private String color;
    private String year;
    private double engine;
    
    public Motorcycle(String color, String year, double engine) {
        configureMotorcycle(color, year, engine);
    }

    @Override // InterfaceVehicleCar
    public void configureMotorcycle(String color, String year, double engine) {
        System.out.println("Configuring " + color + " motorcycle, from " + year + " with " + engine + " engine.");
        startVehicle();
    }

    @Override // InterfaceVehicle
    public void startVehicle() {
        System.out.println("Starting engines... ");
    }
}

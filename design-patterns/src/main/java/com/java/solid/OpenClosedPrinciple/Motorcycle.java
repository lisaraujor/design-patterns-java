package com.java.solid.OpenClosedPrinciple;

public class Motorcycle extends Vehicle{
    
    public Motorcycle(String color, String year, double engine){
        this.color = color;
        this.year = year;
        this.engine = engine;

        configureMotorcycle();
    }

    public void configureMotorcycle() { 
        System.out.println(String.format("Creating a %s motorcycle, year %s, %s engine", color, year, engine));
        startVehicle();
    }
}

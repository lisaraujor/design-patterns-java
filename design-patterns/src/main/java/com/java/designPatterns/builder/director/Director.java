package com.java.designpatterns.builder.director;

import com.java.designpatterns.builder.builders.InterfaceBuilder;
import com.java.designpatterns.builder.components.CarType;
import com.java.designpatterns.builder.components.Engine;
import com.java.designpatterns.builder.components.Transmission;

public class Director {
    
    public void constructSedanCar(InterfaceBuilder builder) {
        builder.setCartType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(InterfaceBuilder builder) {
        builder.setCartType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }
}

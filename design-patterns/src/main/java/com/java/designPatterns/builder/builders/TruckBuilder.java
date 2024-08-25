package com.java.designpatterns.builder.builders;

import com.java.designpatterns.builder.cars.Truck;
import com.java.designpatterns.builder.components.CarType;
import com.java.designpatterns.builder.components.Engine;
import com.java.designpatterns.builder.components.Transmission;

public class TruckBuilder implements InterfaceBuilder {

    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCartType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck getResult(){ 
        return new Truck(carType, seats, engine, transmission);
    }
    
    
}

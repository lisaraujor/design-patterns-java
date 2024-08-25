package com.java.designpatterns.builder.builders;

import com.java.designpatterns.builder.cars.Car;
import com.java.designpatterns.builder.components.CarType;
import com.java.designpatterns.builder.components.Engine;
import com.java.designpatterns.builder.components.Transmission;

public class CarBuilder implements InterfaceBuilder {

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

    public Car getResult(){ 
        return new Car(carType, seats, engine, transmission);
    }
}

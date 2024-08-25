package com.java.designpatterns.builder.builders;

import com.java.designpatterns.builder.components.CarType;
import com.java.designpatterns.builder.components.Engine;
import com.java.designpatterns.builder.components.Transmission;

public interface InterfaceBuilder {

    void setCartType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}

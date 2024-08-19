package com.java.designPatterns.FactoryMethod;

import com.java.designPatterns.FactoryMethod.vehicles.Bike;
import com.java.designPatterns.FactoryMethod.vehicles.InterfaceVehicle;

public class BikeTransport extends Transport {

    @Override
    protected InterfaceVehicle createTransport() {
        return new Bike();
    }
    
}

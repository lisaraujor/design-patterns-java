package com.java.designPatterns.FactoryMethod;

import com.java.designPatterns.FactoryMethod.vehicles.Car;
import com.java.designPatterns.FactoryMethod.vehicles.InterfaceVehicle;

public class CarTransport extends Transport {

    @Override
    protected InterfaceVehicle createTransport() {
        return new Car();
    }
    
}

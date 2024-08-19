package com.java.designPatterns.FactoryMethod;

import com.java.designPatterns.FactoryMethod.vehicles.InterfaceVehicle;
import com.java.designPatterns.FactoryMethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

    @Override
    protected InterfaceVehicle createTransport() {
        return new Motorcycle();
    }

}

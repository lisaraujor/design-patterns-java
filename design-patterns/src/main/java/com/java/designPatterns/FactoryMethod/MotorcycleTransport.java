package com.java.designpatterns.factorymethod;

import com.java.designpatterns.factorymethod.vehicles.InterfaceVehicle;
import com.java.designpatterns.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

    @Override
    protected InterfaceVehicle createTransport() {
        return new Motorcycle();
    }

}

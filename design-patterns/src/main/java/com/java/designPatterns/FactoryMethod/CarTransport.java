package com.java.designpatterns.factorymethod;

import com.java.designpatterns.factorymethod.vehicles.Car;
import com.java.designpatterns.factorymethod.vehicles.InterfaceVehicle;

public class CarTransport extends Transport {

    @Override
    protected InterfaceVehicle createTransport() {
        return new Car();
    }
    
}

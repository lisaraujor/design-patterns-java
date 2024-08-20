package com.java.designpatterns.factorymethod;

import com.java.designpatterns.factorymethod.vehicles.Bike;
import com.java.designpatterns.factorymethod.vehicles.InterfaceVehicle;

public class BikeTransport extends Transport {

    @Override
    protected InterfaceVehicle createTransport() {
        return new Bike();
    }
    
}

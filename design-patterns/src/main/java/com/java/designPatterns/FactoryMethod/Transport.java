package com.java.designpatterns.factorymethod;

import com.java.designpatterns.factorymethod.vehicles.InterfaceVehicle;

public abstract class Transport {
    
    void startTransport() {
        InterfaceVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract InterfaceVehicle createTransport();
}

package com.java.designPatterns.FactoryMethod;

import com.java.designPatterns.FactoryMethod.vehicles.InterfaceVehicle;

public abstract class Transport {
    
    void startTransport() {
        InterfaceVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract InterfaceVehicle createTransport();
}

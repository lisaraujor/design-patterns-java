package com.java.designpatterns.abstractfactory.app;

import com.java.designpatterns.abstractfactory.aircrafts.InterfaceAircraft;
import com.java.designpatterns.abstractfactory.factories.InterfaceTransportFactory;
import com.java.designpatterns.abstractfactory.landvehicles.InterfaceLandVehicle;

public class Application {
    private InterfaceLandVehicle vehicle;
    private InterfaceAircraft aircraft;

    public Application(InterfaceTransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
    }
}

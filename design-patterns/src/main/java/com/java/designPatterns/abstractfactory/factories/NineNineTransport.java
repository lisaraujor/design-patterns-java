package com.java.designpatterns.abstractfactory.factories;

import com.java.designpatterns.abstractfactory.aircrafts.Helicopter;
import com.java.designpatterns.abstractfactory.aircrafts.InterfaceAircraft;
import com.java.designpatterns.abstractfactory.landvehicles.InterfaceLandVehicle;
import com.java.designpatterns.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements InterfaceTransportFactory {

    @Override
    public InterfaceLandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public InterfaceAircraft createTransportAircraft() {
        return new Helicopter();
    }

}

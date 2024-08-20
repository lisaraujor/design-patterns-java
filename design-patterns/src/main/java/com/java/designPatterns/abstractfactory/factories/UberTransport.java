package com.java.designpatterns.abstractfactory.factories;

import com.java.designpatterns.abstractfactory.aircrafts.Airplane;
import com.java.designpatterns.abstractfactory.aircrafts.InterfaceAircraft;
import com.java.designpatterns.abstractfactory.landvehicles.Car;
import com.java.designpatterns.abstractfactory.landvehicles.InterfaceLandVehicle;

public class UberTransport implements InterfaceTransportFactory {

    @Override
    public InterfaceLandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public InterfaceAircraft createTransportAircraft() {
        return new Airplane();
    }

}

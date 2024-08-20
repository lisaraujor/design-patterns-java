package com.java.designpatterns.abstractfactory.factories;

import com.java.designpatterns.abstractfactory.aircrafts.InterfaceAircraft;
import com.java.designpatterns.abstractfactory.landvehicles.InterfaceLandVehicle;

public interface InterfaceTransportFactory {
    InterfaceLandVehicle createTransportVehicle();
    InterfaceAircraft createTransportAircraft();
}

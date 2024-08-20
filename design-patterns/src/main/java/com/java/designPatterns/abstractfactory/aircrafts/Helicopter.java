package com.java.designpatterns.abstractfactory.aircrafts;

public class Helicopter implements InterfaceAircraft {

    @Override
    public void startRoute() {
        System.out.println("Requesting a helicopter...");
        wind();
        getCargo();
        System.out.println("Turning on the helicopter propellers......");
        System.out.println("Permission to take off...");
        System.out.println("Flight authorized!\n");
    }

    @Override
    public void getCargo() {
        System.out.println("Passengers on board the helicopter.");
    }

    @Override
    public void wind() {
        System.out.println("Winds at 25 km/h.");
    }

}

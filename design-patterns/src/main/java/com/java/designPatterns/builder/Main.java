package com.java.designpatterns.builder;

import com.java.designpatterns.builder.builders.CarBuilder;
import com.java.designpatterns.builder.builders.TruckBuilder;
import com.java.designpatterns.builder.cars.Car;
import com.java.designpatterns.builder.cars.Truck;
import com.java.designpatterns.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSedanCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println(car.getCarType() + " was successfully created.");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println("Truck: " + truck.result());

    }
}

package com.java;

import com.java.solid.OpenClosedPrinciple.Car;
import com.java.solid.OpenClosedPrinciple.Motorcycle;
import com.java.solid.OpenClosedPrinciple.TypeVehicle;

public class Main {
    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {
        
        typeVehicle = TypeVehicle.MOTORCYCLE;

        if (typeVehicle == TypeVehicle.CAR){
            Car car = new Car("blue", "2022", 2.6, 4);
        } else {
            Motorcycle motorcycle = new Motorcycle("red", "2020", 250);
        }
    }
}
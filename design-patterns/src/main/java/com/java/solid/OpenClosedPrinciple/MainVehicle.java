package com.java.solid.openclosedprinciple;

public class MainVehicle {
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
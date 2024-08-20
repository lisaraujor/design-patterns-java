package com.java.designpatterns.factorymethod;

public class Main {

    private static Transport transport;
    public static void main(String[] args) {
        
        configure(args[0]);
        if (transport != null) {
            runTranport();
        }
    }

    private static void runTranport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "bike":
                transport = new BikeTransport();
                break;
            default:
                System.out.println("Select delivery type: ");
        }
    }
}

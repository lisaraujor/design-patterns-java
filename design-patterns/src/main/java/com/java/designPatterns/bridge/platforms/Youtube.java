package com.java.designpatterns.bridge.platforms;

public class Youtube implements InterfacePlatform {

    public Youtube(){
        configureRMTP();
        System.out.println("Youtube: Transmission started!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube: Configurating broadcasting...");
    }

    @Override
    public void authToken() {
        System.out.println("Youtube: Authorizing application...");
    }
}

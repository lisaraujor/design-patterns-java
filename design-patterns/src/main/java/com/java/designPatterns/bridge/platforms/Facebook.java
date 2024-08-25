package com.java.designpatterns.bridge.platforms;

public class Facebook implements InterfacePlatform {

    public Facebook(){
        configureRMTP();
        System.out.println("Facebook: Transmission started!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Account authorized!");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Authorizing application...");
    }

}

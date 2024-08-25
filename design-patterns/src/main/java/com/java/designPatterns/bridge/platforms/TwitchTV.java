package com.java.designpatterns.bridge.platforms;

public class TwitchTV implements InterfacePlatform{

    public TwitchTV(){
        configureRMTP();
        System.out.println("TwitchTV: Transmission started!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Configurating RMTP...");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validating channel...");
    }

}

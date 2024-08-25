package com.java.designpatterns.bridge.transmissions;

import com.java.designpatterns.bridge.platforms.InterfacePlatform;

public class Live implements InterfaceTransmission {
    
    protected InterfacePlatform platform;
    
    public Live(){

    }

    public Live(InterfacePlatform platform){
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Starting transmission...");
    }

    @Override
    public void result() {
        System.out.println("On air!");
    }
    
}

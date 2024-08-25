package com.java.designpatterns.bridge.transmissions;

import com.java.designpatterns.bridge.platforms.InterfacePlatform;

public class AdvancedLive extends Live {
    
    public AdvancedLive(InterfacePlatform platform) {
        super.platform = platform;
    }

    public void subtitles() {
        System.out.println("Subtitles activated on transmission!");
    }

    public void comments() {
        System.out.println("Comments allowed.");
    }
}

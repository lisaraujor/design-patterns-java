package com.java.designpatterns.bridge;

import com.java.designpatterns.bridge.platforms.Facebook;
import com.java.designpatterns.bridge.platforms.InterfacePlatform;
import com.java.designpatterns.bridge.platforms.TwitchTV;
import com.java.designpatterns.bridge.platforms.Youtube;
import com.java.designpatterns.bridge.transmissions.Live;

public class Main {
    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new TwitchTV());
        startLive(new Facebook());

    }

    public static void startLive(InterfacePlatform platform) {
        System.out.println("Please wait...");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
    }
}

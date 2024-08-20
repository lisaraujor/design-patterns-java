package com.java.designpatterns.abstractfactory;

import com.java.designpatterns.abstractfactory.app.Application;
import com.java.designpatterns.abstractfactory.factories.InterfaceTransportFactory;
import com.java.designpatterns.abstractfactory.factories.NineNineTransport;
import com.java.designpatterns.abstractfactory.factories.UberTransport;

public class Main {

    public static Application configureApplication(){
        Application app;
        InterfaceTransportFactory factory;

        String company = "99";

        if (company == "uber") {
            factory = new UberTransport();
        } else {
            factory = new NineNineTransport();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}

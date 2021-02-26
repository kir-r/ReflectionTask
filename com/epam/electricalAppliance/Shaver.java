package com.epam.electricalAppliance;

public class Shaver extends ElectricalAppliance {
    private final static String name = "Shaver Sharp";
    private int powerConsumption = 1000;

    public Shaver(boolean pluggedIn, String manufacturer) {
        super(pluggedIn, manufacturer);
    }
}

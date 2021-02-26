package com.epam.electricalAppliance;

public class Fridge extends ElectricalAppliance {
    private final static String name = "Fridge Daewoo";
    private int powerConsumption = 3000;
    public Fridge(boolean pluggedIn, String manufacturer) {
        super(pluggedIn, manufacturer);
    }
}

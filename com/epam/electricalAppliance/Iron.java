package com.epam.electricalAppliance;

public class Iron extends ElectricalAppliance {
    private final static String name = "Iron Ariston";
    private int powerConsumption = 2000;
    public Iron(boolean pluggedIn, String manufacturer) {
        super(pluggedIn, manufacturer);
    }
}

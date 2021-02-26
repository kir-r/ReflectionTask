package com.epam.electricalAppliance;

public abstract class ElectricalAppliance {
    private String name;
    private boolean pluggedIn;
    private int powerConsumption;
    private String manufacturer;


    public String getName() {
        return name;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ElectricalAppliance(boolean pluggedIn, String manufacturer) {
        this.pluggedIn = pluggedIn;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Electrical appliance: " + name + "\n" +
                "pluggedIn: " + pluggedIn + "\n" +
                "powerConsumption: " + powerConsumption + "\n" +
                "manufacturer: " + manufacturer + "\n";
    }
}

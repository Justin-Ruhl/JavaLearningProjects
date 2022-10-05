package com.company;

public class Shower {

    private boolean isOn;
    private String color;

    public Shower(String color) {
        this.isOn = false;
        this.color = color;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getColor() {
        return color;
    }
}

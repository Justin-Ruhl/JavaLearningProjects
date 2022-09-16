package com.company;

public class Main {

    public static SpeedConverter mySpeedConverter = new SpeedConverter();

    public static void main(String[] args) {
        mySpeedConverter.printConversion(1.5);
        mySpeedConverter.printConversion(10.25);
        mySpeedConverter.printConversion(-5.6);
        mySpeedConverter.printConversion(25.42);
        mySpeedConverter.printConversion(75.114);
    }
}

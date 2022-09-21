package com.company;

public class Main {

    public static SecondsAndMinutes myCalc = new SecondsAndMinutes();

    public static void main(String[] args) {
        System.out.println(myCalc.getDurationString(240,59));
        System.out.println(myCalc.getDurationString(984389));
        System.out.println(myCalc.getDurationString(-10));
        System.out.println(myCalc.getDurationString(10));
        System.out.println(myCalc.getDurationString(240,-59));
        System.out.println(myCalc.getDurationString(-240,59));
        System.out.println(myCalc.getDurationString(240,100));
    }
}

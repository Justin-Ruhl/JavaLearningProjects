package com.company;

public class Main {

    public static AreaCalculator myCalc = new AreaCalculator();

    public static void main(String[] args) {

        System.out.println(myCalc.area(5.0));
        System.out.println(myCalc.area(-1));
        System.out.println(myCalc.area(5.0,4.0));
        System.out.println(myCalc.area(-1.0, 4));
    }
}

package com.company;

public class Main {

    public static MinutesToYearsDaysCalculator myCalc = new MinutesToYearsDaysCalculator();

    public static void main(String[] args) {

        myCalc.printYearsAndDays(525600);
        myCalc.printYearsAndDays(1051200);
        myCalc.printYearsAndDays(561600);

    }
}

package com.company;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){

        if (minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600L;
            long days = (minutes % 525600)/1440L;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

}

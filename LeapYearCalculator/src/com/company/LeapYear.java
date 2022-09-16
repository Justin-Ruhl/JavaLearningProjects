package com.company;

public class LeapYear {

    public static boolean isLeapYear (int year){
        boolean leapYear = false;
        boolean isValid = false;

        if (year > 0 && year <= 9999){
            isValid = true;
        }

        if (isValid && year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            leapYear = true;
        } else if (isValid && year % 4 == 0 && year % 100 != 0){
            leapYear = true;
        }
        return leapYear;
    }

}

package com.company;

public class Main {

    public static NumberOfDaysInMonth myMonth = new NumberOfDaysInMonth();

    public static void main(String[] args) {
        System.out.println(myMonth.isLeapYear(-1600));
        System.out.println(myMonth.isLeapYear(1600));
        System.out.println(myMonth.isLeapYear(2017));
        System.out.println(myMonth.isLeapYear(2000));

        System.out.println(myMonth.getDaysInMonth(1,2020));
        System.out.println(myMonth.getDaysInMonth(2,2020));
        System.out.println(myMonth.getDaysInMonth(2,2018));
        System.out.println(myMonth.getDaysInMonth(-1,2020));
        System.out.println(myMonth.getDaysInMonth(1,-2020));
    }
}

package com.company;

public class Main {

    public static LeapYear myLeap = new LeapYear();

    public static void main(String[] args) {

        System.out.println(myLeap.isLeapYear(1700));
        System.out.println(myLeap.isLeapYear(1800));
        System.out.println(myLeap.isLeapYear(1900));
        System.out.println(myLeap.isLeapYear(2100));
        System.out.println(myLeap.isLeapYear(2200));
        System.out.println(myLeap.isLeapYear(2300));
        System.out.println(myLeap.isLeapYear(2500));
        System.out.println(myLeap.isLeapYear(2600));

        System.out.println(myLeap.isLeapYear(1600));
        System.out.println(myLeap.isLeapYear(2000));
        System.out.println(myLeap.isLeapYear(2400));

        System.out.println(myLeap.isLeapYear(-1600));
        System.out.println(myLeap.isLeapYear(1600));
        System.out.println(myLeap.isLeapYear(2017));
        System.out.println(myLeap.isLeapYear(2000));


    }
}

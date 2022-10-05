package com.company;

public class Main {

    public static GreatestCommonDivisor myDivisor = new GreatestCommonDivisor();

    public static void main(String[] args) {

        System.out.println(myDivisor.getGreatestCommonDivisor(25,15));
        System.out.println(myDivisor.getGreatestCommonDivisor(12,30));
        System.out.println(myDivisor.getGreatestCommonDivisor(9,18));
        System.out.println(myDivisor.getGreatestCommonDivisor(81,153));

    }
}

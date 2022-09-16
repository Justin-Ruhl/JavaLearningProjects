package com.company;

public class Main {

    public static EqualSumChecker mySumChecker = new EqualSumChecker();

    public static void main(String[] args) {

        System.out.println(mySumChecker.hasEqualSum(1,1,1));
        System.out.println(mySumChecker.hasEqualSum(1,1,2));
        System.out.println(mySumChecker.hasEqualSum(1,-1,0));

    }
}

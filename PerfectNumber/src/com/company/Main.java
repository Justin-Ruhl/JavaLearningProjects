package com.company;

public class Main {

    public static PerfectNumber myNumber = new PerfectNumber();

    public static void main(String[] args) {

        System.out.println(myNumber.isPerfectNumber(6));
        System.out.println(myNumber.isPerfectNumber(28));
        System.out.println(myNumber.isPerfectNumber(5));
        System.out.println(myNumber.isPerfectNumber(-1));

    }
}

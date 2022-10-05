package com.company;

public class Main {

    public static SharedDigit myDigits = new SharedDigit();

    public static void main(String[] args) {
        System.out.println(myDigits.hasSharedDigit(12,23));
        System.out.println(myDigits.hasSharedDigit(9,99));
        System.out.println(myDigits.hasSharedDigit(15,55));
    }
}

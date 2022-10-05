package com.company;

public class Main {

    public static LastDigitChecker myChecker = new LastDigitChecker();

    public static void main(String[] args) {

        System.out.println(myChecker.hasSameLastDigit(41,22,71));
        System.out.println(myChecker.hasSameLastDigit(23,32,42));
        System.out.println(myChecker.hasSameLastDigit(9,99,999));

    }
}

package com.company;

public class Main {

    public static FirstLastDigitSum mySum = new FirstLastDigitSum();

    public static void main(String[] args) {

        System.out.println(mySum.sumFirstAndLastDigit(252));
        System.out.println(mySum.sumFirstAndLastDigit(257));
        System.out.println(mySum.sumFirstAndLastDigit(0));
        System.out.println(mySum.sumFirstAndLastDigit(5));
        System.out.println(mySum.sumFirstAndLastDigit(-10));

    }
}

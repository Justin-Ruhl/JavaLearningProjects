package com.company;

public class Main {

    public static EvenDigitSum mySum = new EvenDigitSum();

    public static void main(String[] args) {

        System.out.println(mySum.getEvenDigitSum(123456789));
        System.out.println(mySum.getEvenDigitSum(252));
        System.out.println(mySum.getEvenDigitSum(-22));

    }
}

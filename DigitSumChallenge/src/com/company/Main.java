package com.company;

public class Main {

    public static DigitSum mySum = new DigitSum();

    public static void main(String[] args) {

        System.out.println(mySum.sumDigits(125));
        System.out.println(mySum.sumDigits(7));
        System.out.println(mySum.sumDigits(9));
        System.out.println(mySum.sumDigits(-10001));
        System.out.println(mySum.sumDigits(92875830));

    }
}

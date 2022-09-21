package com.company;

public class Main {

    public static SumOddRange myRange = new SumOddRange();

    public static void main(String[] args) {

        System.out.println(myRange.sumOdd(1,100));
        System.out.println(myRange.sumOdd(-1,100));
        System.out.println(myRange.sumOdd(100,100));
        System.out.println(myRange.sumOdd(13,13));
        System.out.println(myRange.sumOdd(100,-100));
        System.out.println(myRange.sumOdd(100,1000));
    }
}

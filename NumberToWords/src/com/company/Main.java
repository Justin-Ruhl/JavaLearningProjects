package com.company;

public class Main {

    public static NumberToWords myNum = new NumberToWords();

    public static void main(String[] args) {

        myNum.numberToWords(121);
        System.out.println("**************************");
        myNum.numberToWords(1200200);
        System.out.println("**************************");
        myNum.numberToWords(0);
        System.out.println("**************************");
        myNum.numberToWords(66);
        System.out.println("**************************");
        myNum.numberToWords(1234);



    }
}

package com.company;

public class Main {

    public static FactorPrinter myPrinter = new FactorPrinter();

    public static void main(String[] args) {

        myPrinter.printFactors(6);
        myPrinter.printFactors(32);
        myPrinter.printFactors(10);
        myPrinter.printFactors(-1);

    }
}

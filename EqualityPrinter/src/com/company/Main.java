package com.company;

public class Main {

    public static IntEqualityPrinter myPrinter = new IntEqualityPrinter();

    public static void main(String[] args) {
        myPrinter.printEqual(1,1,1);
        myPrinter.printEqual(1,1,2);
        myPrinter.printEqual(-1,-1,-1);
        myPrinter.printEqual(1,2,3);
    }
}

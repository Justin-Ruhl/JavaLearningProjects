package com.company;

public class FactorPrinter {

    public static void printFactors(int number) {
        int count = 0;
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            while (count < number) {
                count++;
                if (number % count == 0) {
                    System.out.println(count);
                }
            }
        }
    }
}

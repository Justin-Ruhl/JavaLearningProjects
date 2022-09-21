package com.company;

import java.io.StringReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 5.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello");
        }

        for (int i = 2; i <= 8; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }
        for (int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }
        int counter = 0;
        for (int i = 162000; i < 1000000; i++){
            if(isPrime(i)){
                System.out.println(i + " is a prime number!");
                counter++;
                if (counter == 7){
                    break;
                }
            }
        }

        int sum = 0;
        int sumCounter = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                sum += i;
                sumCounter ++;
                System.out.println("Number " + i + " met the specified conditions!");
                if (sumCounter == 5){
                    System.out.println("The total sum is " + sum + "!");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}

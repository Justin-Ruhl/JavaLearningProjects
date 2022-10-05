package com.company;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        int prime = -1;
        if (number > 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    boolean isPrime = true;
                    for (int x = 2; x <= i / 2; x++) {
                        if ((i % x == 0)) {
                            isPrime = false;
                        }
                    }
                    if (isPrime) {
                        prime = i;
                    }
                }
            }
        }
        return prime;
    }
}



package com.company;

public class Main {

    public static LargestPrime myPrime = new LargestPrime();

    public static void main(String[] args) {

        System.out.println(myPrime.getLargestPrime(21));
        System.out.println(myPrime.getLargestPrime(217));
        System.out.println(myPrime.getLargestPrime(0));
        System.out.println(myPrime.getLargestPrime(45));
        System.out.println(myPrime.getLargestPrime(-1));
        System.out.println(myPrime.getLargestPrime(7));

    }
}

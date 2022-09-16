package com.company;

public class Main {

    public static TeenNumberChecker teenChecker = new TeenNumberChecker();

    public static void main(String[] args) {

        System.out.println(teenChecker.hasTeen(9,99,19));
        System.out.println(teenChecker.hasTeen(23,15,42));
        System.out.println(teenChecker.hasTeen(22,23,34));

    }
}

package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        boolean shared = false;
        if ((a > 9 && a < 100 && b > 9 && b < 100) && ((a % 10 == b % 10) || (a % 10 == b / 10) || (a / 10 == b % 10) || (a / 10 == b / 10))) {
            shared = true;
        }
        return shared;
    }
}

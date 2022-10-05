package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        boolean isSame = false;
        if (isValid(a) && isValid(b) && isValid(c)){
            a %= 10;
            b %= 10;
            c %= 10;
            if (a == b || a == c || b == c){
                isSame = true;
            }
        }
        return isSame;
    }

    public static boolean isValid(int number){
        boolean isValid = false;
        if (number > 9 && number <= 1000){
            isValid = true;
        }
        return isValid;
    }
}

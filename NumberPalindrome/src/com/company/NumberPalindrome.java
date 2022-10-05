package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        boolean palindrome = false;
        int reverseNumber = 0;
        int startNumber = number;
        while (startNumber > 9){
            reverseNumber += startNumber % 10;
            reverseNumber *= 10;
            startNumber /= 10;
        }
        reverseNumber += startNumber;
        if (reverseNumber == number){
            palindrome = true;
        }
        return palindrome;
    }

}

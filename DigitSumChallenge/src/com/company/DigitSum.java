package com.company;

public class DigitSum {

    public static int sumDigits(int number) {
        int sum = -1;
        if (number > 9) {
            sum++;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
        }
        return sum;
    }
}

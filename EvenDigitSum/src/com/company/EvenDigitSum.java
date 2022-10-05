package com.company;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        int sum = -1;
        if (number >= 0){
            sum++;
            int digit;
            while (number > 0){
                digit = number % 10;
                if (digit % 2 == 0){
                    sum += digit;
                }
                number /= 10;
            }
        }
        return sum;
    }
}

package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int sum = -1;
        int first;
        int last = number % 10;
        if (number >= 0){
            while (number > 9){
                number /= 10;
            }
            first = number;
            sum = first + last;
        }
        return sum;
    }

}

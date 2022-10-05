package com.company;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        boolean isPerfect = false;
        int perfectSum = 0;
        int count = 0;
        if (number > 0) {
            while (count < (number - 1)) {
                count++;
                if (number % count == 0) {
                    perfectSum += count;
                }
            }
            if (number == perfectSum){
                isPerfect = true;
            }
        }
        return isPerfect;
    }
}

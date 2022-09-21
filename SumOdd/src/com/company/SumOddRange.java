package com.company;

public class SumOddRange {

    public static boolean isOdd(int number){
        boolean odd = false;
        if ((number > 0 && number % 2 != 0)){
            odd = true;
        }
        return odd;
    }

    public static int sumOdd(int start, int end){
        int sum = -1;

        if(start > 0 && end >= start){
            sum += 1;
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }
        }

        return sum;
    }
}

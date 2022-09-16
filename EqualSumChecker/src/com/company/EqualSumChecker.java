package com.company;

public class EqualSumChecker {

    public static boolean hasEqualSum(int firstInt, int secondInt, int thirdInt){
        boolean equalSum = false;

        if (firstInt + secondInt == thirdInt){
            equalSum = true;
        }

        return equalSum;
    }

}

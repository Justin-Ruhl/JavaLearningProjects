package com.company;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double firstDecimal, double secondDecimal){
        boolean isEqual = false;
        int firstInt = (int)(firstDecimal * 1000);
        int secondInt = (int)(secondDecimal * 1000);
        if (firstInt == secondInt){
            isEqual = true;
        }
        return isEqual;
    }

}

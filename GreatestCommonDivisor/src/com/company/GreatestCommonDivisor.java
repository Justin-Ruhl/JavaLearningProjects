package com.company;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestDivisor = -1;
        int count = 0;

        if (first > 9 && second > 9) {
            while (count <= first && count <= second) {
                count++;
                if (first % count == 0 && second % count == 0) {
                    greatestDivisor = count;
                }
            }
        }
        return greatestDivisor;
    }
}

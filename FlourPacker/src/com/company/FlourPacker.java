package com.company;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean packable = false;
        if (((bigCount * 5) + smallCount >= goal) && bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            while (goal >= 5 && bigCount > 0) {
                goal -= 5;
                bigCount--;
            }
            if (goal <= smallCount) {
                packable = true;
            }
        }
        return packable;
    }
}

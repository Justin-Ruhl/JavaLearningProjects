package com.company;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay){
        boolean wakeUp = true;
        if (!barking){
            wakeUp = false;
        } else if (hourOfTheDay >= 8 && hourOfTheDay <= 22){
            wakeUp = false;
        } else if (hourOfTheDay < 0 || hourOfTheDay > 23){
            wakeUp = false;
        }
        return wakeUp;
    }

}

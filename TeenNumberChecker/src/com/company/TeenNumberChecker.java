package com.company;

public class TeenNumberChecker {

    public static boolean hasTeen (int one, int two, int three){

        boolean teen = false;

        if (isTeen(one) || isTeen(two) || isTeen(three)){
            teen = true;
        }
        return teen;
    }

    public static boolean isTeen (int number){
        boolean isTeen = false;

        if (number >= 13 && number <= 19){
            isTeen = true;
        }

        return isTeen;
    }

}

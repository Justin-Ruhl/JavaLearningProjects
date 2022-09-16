package com.company;

public class Main {

    public static BarkingDog myDog = new BarkingDog();

    public static void main(String[] args) {

        System.out.println(myDog.shouldWakeUp(true,1));
        System.out.println(myDog.shouldWakeUp(false,2));
        System.out.println(myDog.shouldWakeUp(true,8));
        System.out.println(myDog.shouldWakeUp(true,-1));
    }
}

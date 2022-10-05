package com.company;

public class Main {

    public static FlourPacker myPacker = new FlourPacker();

    public static void main(String[] args) {

        System.out.println(myPacker.canPack(1,0,4));
        System.out.println(myPacker.canPack(1,0,5));
        System.out.println(myPacker.canPack(0,5,4));
        System.out.println(myPacker.canPack(2,2,11));
        System.out.println(myPacker.canPack(-3,2,12));

    }
}

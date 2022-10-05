package com.company;

public class Main {

    public static void main(String[] args) {

        Bathroom myBathroom = new Bathroom(new Toilet("White"), new Shower("White"));

        myBathroom.useToilet();
        myBathroom.takeShower();

    }
}

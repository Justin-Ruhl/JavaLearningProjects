package com.company;

public class Main {

    public static void main(String[] args) {

        Ford myTruck = new Ford("F-150");

        myTruck.move(25);
        myTruck.turn(150);

        myTruck.move(1000);
        myTruck.turn(459);

        myTruck.start();

        myTruck.move(1000);

        myTruck.move(45);
        myTruck.turn(459);

        myTruck.turn(220);
        myTruck.move(0);

        myTruck.move(-20);
        myTruck.move(13);
    }
}

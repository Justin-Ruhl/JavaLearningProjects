package com.company;

public class Vehicle {

    private int speed;
    private int direction;

    public Vehicle(int speed, int direction) {
        this.speed = speed;
        this.direction = direction;
    }

    public void move(int speed) {
        this.speed = speed;
        System.out.println("Your vehicle is moving at a speed of " + this.speed + " with a heading of " + this.direction + ".");
    }

    public void turn(int direction) {
        if (direction >= 0 && direction <= 360) {
            this.direction = direction;
            System.out.println("You new heading is now " + this.direction + " degrees.");
        } else {
            System.out.println("Direction must be a number between 0 and 360 degrees.");
        }
    }

    public int getSpeed() {
        return speed;
    }
}

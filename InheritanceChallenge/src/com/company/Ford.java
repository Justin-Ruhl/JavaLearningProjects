package com.company;

public class Ford extends Car {

    private String model;
    private int gear;

    public Ford(String model) {
        super(4);
        this.model = model;
        this.gear = 0;
    }

    @Override
    public void move(int speed) {
        if (isPoweredOn() && speed >= -40 && speed < 0) {
            this.gear = -1;
            System.out.println("You shift the transmission into reverse.");
            super.move(speed);
        } else if (isPoweredOn() && speed == 0) {
            this.gear = 0;
            System.out.println("The vehicle is now in park.");
            super.move(speed);
        } else if (isPoweredOn() && speed > 0 && speed < 15) {
            this.gear = 1;
            System.out.println("The car is now in " + this.gear + "st gear.");
            super.move(speed);
        } else if (isPoweredOn() && speed >= 15 && speed < 25) {
            this.gear = 2;
            System.out.println("The car is now in " + this.gear + "nd gear.");
            super.move(speed);
        } else if (isPoweredOn() && speed >= 25 && speed < 40) {
            this.gear = 3;
            System.out.println("The car is now in " + this.gear + "rd gear.");
            super.move(speed);
        } else if (isPoweredOn() && speed >= 40 && speed < 55) {
            this.gear = 4;
            System.out.println("The car is now in " + this.gear + "th gear.");
            super.move(speed);
        } else if (isPoweredOn() && speed >= 55 && speed < 100) {
            this.gear = 5;
            System.out.println("The car is now in " + this.gear + "th gear.");
            super.move(speed);
        } else if (isPoweredOn()) {
            System.out.println("The " + this.model + " is unable to move at that speed.");
        } else {
            System.out.println("The " + this.model + " is currently off.");
        }
    }
}

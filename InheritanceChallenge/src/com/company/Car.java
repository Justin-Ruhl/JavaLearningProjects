package com.company;

public class Car extends Vehicle {

    private boolean poweredOn;
    private int wheels;

    public Car(int wheels) {
        super(0, 0);
        this.poweredOn = false;
        this.wheels = wheels;
    }

    public void start() {
        if (!this.poweredOn) {
            this.poweredOn = true;
            System.out.println("The engine roars to life.");
        } else {
            System.out.println("The vehicle is already started!");
        }
    }

    @Override
    public void move(int speed) {
        if (this.poweredOn && speed != 0) {
            System.out.println("You can hear the " + this.wheels + " tires moving the vehicle.");
            super.move(speed);
        } else if (this.poweredOn) {
            System.out.println("The vehicle has stopped");
            super.move(speed);
        } else {
            System.out.println("Start the vehicle in order to move!");
        }
    }

    @Override
    public void turn(int direction) {
        if (super.getSpeed() != 0 && direction >= 0 && direction <= 360) {
            System.out.println("You turn the steering wheel.");
            super.turn(direction);
        } else if (super.getSpeed() == 0) {
            System.out.println("Unable to change the direction of a non moving vehicle.");
        } else {
            super.turn(direction);
        }
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }
}

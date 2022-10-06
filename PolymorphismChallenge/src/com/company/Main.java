package com.company;

class Car{
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine(){
        System.out.println("You hear the engine hum to life.");
    }

    public void accelerate(){
        System.out.println("The car begins to move.");
    }

    public void brake(){
        System.out.println("The car comes to a stop.");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}

class BeatUpTruck extends Car{

    public BeatUpTruck() {
        super("Old Reliable", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("The truck struggles to starts but then stutters to life.");;
    }

    @Override
    public void accelerate() {
        System.out.println("The trucks noisy engine throttles the vehicle slowly up to speed.");;
    }

    @Override
    public void brake() {
        System.out.println("You hear a loud screech as the truck comes to a halt.");;
    }
}

class SportsCar extends Car{

    public SportsCar() {
        super("Super Car", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("The super car roars to life.");;
    }

    @Override
    public void accelerate() {
        System.out.println("You fly back into your seat as the car launches forward.");;
    }

    @Override
    public void brake() {
        System.out.println("The super car screeches to a quick halt.");;
    }
}

class MiniVan extends Car{

    public MiniVan() {
        super("Family Van", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("The van's engine is now on.");;
    }

    @Override
    public void accelerate() {
        System.out.println("You start to move forward.");;
    }

    @Override
    public void brake() {
        System.out.println("The van comes to a slow but steady stop.");;
    }
}

public class Main {

    public static void main(String[] args) {

        Car genericCar = new Car("Generic Car", 4);
        BeatUpTruck myTruck = new BeatUpTruck();
        SportsCar mySuperCar = new SportsCar();
        MiniVan myVan = new MiniVan();

        genericCar.startEngine();
        genericCar.accelerate();
        genericCar.brake();

        myTruck.startEngine();
        myTruck.accelerate();
        myTruck.brake();

        mySuperCar.startEngine();
        mySuperCar.accelerate();
        mySuperCar.brake();

        myVan.startEngine();
        myVan.accelerate();
        myVan.brake();

    }
}

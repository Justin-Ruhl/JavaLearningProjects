package com.company;

public class Bathroom {

    private Toilet toilet;
    private Shower shower;

    public Bathroom(Toilet toilet, Shower shower) {
        this.toilet = toilet;
        this.shower = shower;
    }

    public void useToilet(){
        System.out.println("You feel relieved");
        toilet.setEmpty(false);
        toilet.flush();
    }

    public void takeShower(){
        if(!shower.isOn()){
            turnOn();
        }
            System.out.println("You take a shower.");
            turnOff();

    }

    private void turnOn(){
        if (!shower.isOn()){
            System.out.println("You turn the water on.");
        } else {
            System.out.println("The shower is already on.");
        }
    }

    private void turnOff(){
        if (!shower.isOn()) {
            System.out.println("You turn off the water.");
        } else {
            System.out.println("The shower is already on.");
        }
    }

}

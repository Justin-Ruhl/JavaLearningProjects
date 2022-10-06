package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger myBurger = new Hamburger("White", "Angus", "Cheese", "Bacon", "Lettuce", "Tomato");

        System.out.println(myBurger.getPrice());

        HealthyBurger myHealthyBurger = new HealthyBurger("Angus", "Cheese", "Bacon", "Lettuce", "Tomato", "Pickles", "Onion");

        System.out.println(myHealthyBurger.getPrice());

        DeluxeBurger myDeluxeBurger = new DeluxeBurger("White", "Chicken");

        System.out.println(myDeluxeBurger.getPrice());
    }
}

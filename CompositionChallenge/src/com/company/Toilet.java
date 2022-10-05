package com.company;

public class Toilet {

    private boolean isEmpty;
    private String color;

    public Toilet(String color) {
        this.isEmpty = true;
        this.color = color;
    }

    public void flush(){
        if (!isEmpty){
            System.out.println("You flush away the waste.");
            isEmpty = true;
        } else {
            System.out.println("The toilet is empty already, it's not good to waste water.");
        }
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}

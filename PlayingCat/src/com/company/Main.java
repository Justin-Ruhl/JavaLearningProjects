package com.company;

public class Main {

    public static PlayingCat myCat = new PlayingCat();

    public static void main(String[] args) {

        System.out.println(myCat.isCatPlaying(true,10));
        System.out.println(myCat.isCatPlaying(false,36));
        System.out.println(myCat.isCatPlaying(false,35));

    }
}

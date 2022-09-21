package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInches(24));
        System.out.println(calcFeetAndInches(18));
        System.out.println(calcFeetAndInches(-3));

        System.out.println(calcFeetAndInches(11,3));
        System.out.println(calcFeetAndInches(12, 5));
        System.out.println(calcFeetAndInches(8, -2));
        System.out.println(calcFeetAndInches(-3, 4));

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInches(int inches, int feet){
        double centimeters = -1;
        if (inches >= 0 && inches <= 12 && feet >= 0){
            centimeters = ((feet * 12) + inches) * 2.54D;
        }
        return centimeters;
    }

    public static double calcFeetAndInches(int inches){
        double centimeters = -1;
        if (inches >= 0){
            int feet = (inches / 12);
            inches = inches % 12;
            centimeters = calcFeetAndInches(inches, feet);
        }
        return centimeters;
    }

}



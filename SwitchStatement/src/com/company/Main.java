package com.company;

public class Main {

    public static DayOfTheWeek myDay = new DayOfTheWeek();

    public static void main(String[] args) {

        int value = 3;
        if(value == 1){
            System.out.println("Value was 1");
        } else if (value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Value not 1 or 2");
        }

        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a  4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 - 5");
                break;
        }

        char myChar = 'F';

        switch(myChar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found the char " + myChar + ".");
                break;
            default:
                System.out.println("Char A, B, C, D, or E was not found. Actually it was " + myChar + ".");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

        myDay.printDayOfTheWeek(0);
        myDay.printDayOfTheWeek(1);
        myDay.printDayOfTheWeek(2);
        myDay.printDayOfTheWeek(3);
        myDay.printDayOfTheWeek(4);
        myDay.printDayOfTheWeek(5);
        myDay.printDayOfTheWeek(6);
        myDay.printDayOfTheWeek(67);
    }
}

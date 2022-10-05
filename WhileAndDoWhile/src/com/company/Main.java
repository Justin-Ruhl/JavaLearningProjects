package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6){
            System.out.println("Count value is " + count);
            count ++;
        }

        count = 1;
        while (true){
            if (count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;
            if (count>100){
                break;
            }
        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        count = 0;

        while (number <= finishNumber){
            number ++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            count++;
            if (count == 5){
                System.out.println("I have found " + count + " even numbers!");
                break;
            }
        }

    }

    public static boolean isEvenNumber(int number){
        boolean isEven = false;
        if (number % 2 == 0){
            isEven = true;
        }
        return isEven;
    }
}

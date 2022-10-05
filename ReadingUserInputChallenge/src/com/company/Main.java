package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        boolean invalid = false;
        while (counter < 10) {
            counter++;
            System.out.println("Enter number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid Input Detected.");
                invalid = true;
                break;
            }
        }
        scanner.close();
        if (!invalid) {
            System.out.println("The sum of the entered numbers is " + sum);
        } else {
            System.out.println("No sum due to invalid input.");
        }
    }
}

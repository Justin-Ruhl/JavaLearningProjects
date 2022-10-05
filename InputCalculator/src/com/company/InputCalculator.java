package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                counter++;
            } else {
                if (sum == 0) {
                    counter = 1;
                }
                break;
            }
            scanner.nextLine();
        }
        int average = (int)Math.round((double) sum / (double) counter);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
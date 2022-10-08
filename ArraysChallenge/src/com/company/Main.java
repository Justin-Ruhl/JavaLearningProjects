package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getIntegers(5);
        System.out.println("Entered array is: ");
        printArray(myArray);
        System.out.println("Sorted array is: ");
        printArray(sortArray(myArray));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers:\r");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int x = 0; x < array.length; x++) {
                if (array[x] > array[i]) {
                    count++;
                }
            }
            int number = array[i];
            int zeroCount = -1;
            while(sortedArray[count] == number && number != 0){
                count++;
            }
            if (number == 0){
                zeroCount++;
                count += zeroCount;
            }
            sortedArray[count] = array[i];
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}

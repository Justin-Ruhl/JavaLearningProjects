package com.company;

import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + number + " integers:\r");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = array.clone();
        for (int i = 0; i < array.length; i++) {
        boolean flag = true;
        while (flag){
            flag = false;
            for (int x = 0; x < sortedArray.length - 1; x++){
                if (sortedArray[x] < sortedArray[x + 1]){
                    int number = sortedArray[x];
                    sortedArray[x] = sortedArray[x + 1];
                    sortedArray[x + 1] = number;
                    flag = true;
                }
            }
        }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}

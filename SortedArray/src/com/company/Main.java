package com.company;

public class Main {

    public static void main(String[] args) {

        SortedArray myArray = new SortedArray();

        int[] array = myArray.getIntegers(5);
        System.out.println("Unsorted input");
        myArray.printArray(array);
        int[] sortedArray = myArray.sortIntegers(array);
        System.out.println("Sorted array");
        myArray.printArray(sortedArray);

    }
}

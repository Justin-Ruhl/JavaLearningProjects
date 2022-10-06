package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.tonerLevel = 100;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void addToner(int tonerAmount) {
        if (this.tonerLevel + tonerAmount <= 100 && tonerAmount > 0) {
            this.tonerLevel += tonerAmount;
            System.out.println("Toner added, the new toner level is " + this.tonerLevel);
        } else if (tonerAmount <= 0) {
            System.out.println("Toner added must be more than 0");
        } else {
            System.out.println("Can not add more toner than the printer can hold. Please use a smaller amount");
        }
    }

    public void printPages(int pages) {
        if (pages <= 0) {
            System.out.println("Pages to print must be a positive number above 0");
        } else {
            int tonerRequired = pages * 2;
            if (this.tonerLevel < tonerRequired) {
                System.out.println("Unable to print, not enough toner remaining to print " + pages + " pages");
            } else {
                if (this.isDuplex){
                    this.pagesPrinted += Math.round(((double)(pages))/2);
                    this.tonerLevel -= tonerRequired;
                    System.out.println("Now printing " + Math.round(((double)(pages))/2) + " duplex pages");
                } else {
                    this.pagesPrinted += pages;
                    this.tonerLevel -= tonerRequired;
                    System.out.println("Now printing " + pages + " pages");
                }
            }
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

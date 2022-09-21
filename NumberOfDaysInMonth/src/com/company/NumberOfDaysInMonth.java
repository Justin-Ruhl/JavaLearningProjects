package com.company;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        boolean leap = false;
        if ((year > 0 && year < 10000) && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            leap = true;
        }
        return leap;
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = -1;
        if (year > 0 && year < 10000 && month > 0 && month <= 12) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 2:
                    daysInMonth = 28;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                default:
                    break;
            }
        }
        if (isLeapYear(year) && year > 0 && year < 10000 && month == 2) {
            daysInMonth = 29;
        }
        return daysInMonth;
    }
}

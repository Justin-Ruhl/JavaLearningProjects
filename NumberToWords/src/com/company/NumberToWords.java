package com.company;

public class NumberToWords {

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int zeros = getDigitCount(number) - getDigitCount(reverse(number));
            number = reverse(number);
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }
            }
            while (zeros > 0) {
                zeros--;
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number > 9 || number < -9) {
            reverse += (number % 10);
            reverse *= 10;
            number /= 10;
        }
        reverse += number;
        return reverse;
    }

    public static int getDigitCount(int number) {
        int digitCount = -1;

        if (number == 0){
            digitCount = 1;
        }
        else if (number > 0) {
            digitCount++;
            while (number > 0) {
                digitCount++;
                number /= 10;
            }
        }
        return digitCount;
    }

}

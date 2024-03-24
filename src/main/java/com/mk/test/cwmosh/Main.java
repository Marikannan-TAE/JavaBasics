package com.mk.test.cwmosh;

import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principle = 0;
        float annualInterst = 0;
        float monthlyInterst = 0;
        int numberOfPayments = 0;
        double mortage = 0.0;
        String mortageFormatted = null;
        byte year;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the principle amount:  ");
            principle = scanner.nextInt();
            if (principle >= 10000 && principle <= 100000000)
                break;
            System.out.print(" Principle amount should be in between of 10000 to  10000000:  ");
        }

        while (true) {
            System.out.print("Enter the rate of Annual interest:  ");
            annualInterst = scanner.nextFloat();
            if (annualInterst > 0 && annualInterst < 30){
                monthlyInterst = annualInterst / PERCENT / MONTHS_IN_YEAR;
            break;
        }
        System.out.println("Annual Intrest should be in between of 0 to 30");
    }

        while (true) {
            System.out.print("Enter the year of the Period :  ");
            year = scanner.nextByte();

            if (year > 0 && year < 30) {
                numberOfPayments = year * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Year should be in between of 0 to 30");
        }

        mortage = principle *
                    (monthlyInterst * Math.pow(1 + monthlyInterst, numberOfPayments))
                    / (Math.pow(1 + monthlyInterst, numberOfPayments) - 1);
        mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);

            System.out.println("Your monthly payment amount is:  " + mortageFormatted);

        }





    }

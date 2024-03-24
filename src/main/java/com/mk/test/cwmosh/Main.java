package com.mk.test.cwmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int principle = (int)readNumber("Enter the principle amount: ",10000,10_000_000);
        float annualInterst = (float)readNumber("Enter the rate of Annual interest:  ", 0 , 30);
        byte years = (byte)readNumber("Enter the years of the Period :  ",0,30);

        double mortage = calculateMortage(principle,annualInterst,years);

        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Your monthly payment amount is:  " + mortageFormatted);
        }

  public static double readNumber(String prompt, double min, double max)
  {
      Scanner scanner = new Scanner(System.in);
      double value;
      while (true) {
          System.out.print(prompt);
          value = scanner.nextFloat();
          if (value > min && value < max)
              break;
          System.out.println("Annual Intrest should be in between of " +min + " and " + max);
      }
      return value;
  }
  public static double calculateMortage(
          int principle,
          float annualInterst,
          byte year )
  {
      final byte MONTHS_IN_YEAR = 12;
      final byte PERCENT = 100;
      float monthlyInterst = annualInterst / PERCENT / MONTHS_IN_YEAR;
      short numberOfPayments = (short)(year * MONTHS_IN_YEAR);
      double mortage = principle *
              (monthlyInterst * Math.pow(1 + monthlyInterst, numberOfPayments))
              / (Math.pow(1 + monthlyInterst, numberOfPayments) - 1);
      return mortage;
  }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fullname;
        System.out.println("Your full name: ");
        fullname = input.next();

        System.out.println("how many hours have you worked this week");
        double hoursworked = input.nextInt();

        final double wage = 9.50;

        double tpay = hoursworked * wage * 0.8;
        double ntpay = hoursworked * wage

        System.out.println((fullname) + " your pay for this week is: " + (tpay) + "with tax");
        System.out.println("without tax you would get: ");







    }
}

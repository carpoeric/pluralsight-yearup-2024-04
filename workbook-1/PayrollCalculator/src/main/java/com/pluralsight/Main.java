package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String userName = scanner.nextLine();

        System.out.print("Hours worked: ");
        double userHours = scanner.nextDouble();

        System.out.print("Pay rate: ");
        double userPayRate = scanner.nextDouble();

        double grossPay = userHours * userPayRate;

        System.out.println("Payroll Summary for " + userName);
        System.out.println("Hours Worked: " + userHours);
        System.out.println("Pay Rate: $" + userPayRate);
        System.out.println("Gross Pay: $" + grossPay);

        scanner.close();
    }
}
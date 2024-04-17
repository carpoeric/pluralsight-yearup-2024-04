package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for name
        System.out.println("Thanks for using the Full Name Parser!");

        System.out.print("Please enter your full name: ");
        String fullNameIn = scanner.nextLine().strip();

        // Split
        String[] nameParts = fullNameIn.split(" ");

        // Format
        if (nameParts.length < 2 || nameParts.length > 3)
        {
            System.out.println("Sorry, please enter your name in the format: (first,last) or (first,middle,last.)");
            scanner.close();
            return;
        }

        // Variables
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];

        String middleName = "";
        if (nameParts.length == 3)
        {
            middleName = nameParts[1];
        }

        // Display
        System.out.println("First Name: " + firstName);

        if (!middleName.isEmpty())
        {
            System.out.println("Middle Name: " + middleName);

        }
        System.out.println("Last Name: " + lastName);


        scanner.close();
    }
}
package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);



        //output
        System.out.println("Thanks for visiting the Full Name App!");

        System.out.print("Please enter your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Please enter your middle name (optional): ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine().trim();


        System.out.print("Please enter your suffix (optional): ");
        String suffix = scanner.nextLine().trim();

        // Data
        StringBuilder fullNameGen = new StringBuilder();
        fullNameGen.append(firstName);
        fullNameGen.append(" ");

        if (!middleName.isEmpty())
        {
            fullNameGen.append(middleName);
            fullNameGen.append(" ");
        }

        fullNameGen.append(lastName);

        if (!suffix.isEmpty())
        {
            fullNameGen.append(", ");
            fullNameGen.append(suffix);
        }

        String fullName = fullNameGen.toString();

        System.out.println("Your full name is: " + fullName);

        scanner.close();
    }
}
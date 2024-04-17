package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display full name
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();

        // Display show date
        System.out.print("Please enter the date of the show (EX: MM/dd/yyy): ");
        String showDateInput = scanner.nextLine();

        // Date
        LocalDate showDate = LocalDate.parse(showDateInput, DateTimeFormatter.ofPattern("MM/dd/yyy"));

        // Display # of tickets
        System.out.print("Please enter how many tickets you need: ");
        int numberOfTickets = scanner.nextInt();

        // End Message
        if (numberOfTickets == 1) {
            System.out.println("Thank you, " + fullName + "! 1 ticket has been reserved for the show on " + showDate + ". ");
        } else {
            System.out.println("Thank you, " + fullName + "! " + numberOfTickets + " tickets have been reserved for the show on " + showDate + ".");
        }

        scanner.close();
    }
}
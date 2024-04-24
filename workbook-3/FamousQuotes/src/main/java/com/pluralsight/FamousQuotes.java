package com.pluralsight;

import java.util.Scanner;
import java.util.Random;


public class FamousQuotes
{
    public static void main(String[] args)
    {
        // Array for quotes
        String[] quotes = {
                "Believe in your flyness, conquer your shyness. - Kanye West",
                "The Loudest One In The Room Is The Weakest One In The Room - Denzel Washington (American Gangster)",
                "It's not dying you need to be afraid of, it's never having lived in the first place. - Seth Rogen",
                "I firmly believe the world will sort itself out in the end. Believe it with me. At least none of us will be around to be proven wrong - Chief Keef",
                "Your life will become better by making other lives better. - Will Smith",
                "Sometimes when you speak from your soul it sound like you singing. - Future",
                "We need money. We need hits. Hits bring money, money brings power, power brings fame, fame change the game. - Young Thug",
                "Hey ya. - Andre Benjamin",
                "The only way to know is to live, learn, and grow. - Ms. Lauryn Hill",
                "Keep working hard and you can get anything that you want. - Aaliyah"
        };

        Scanner scanner = new Scanner(System.in);
        boolean moreQuotes = true;
        Random random = new Random();

        while (moreQuotes)
        {
            System.out.println("Welcome to Famous Quotes Generator! Please choose an option:");
            System.out.println("1. Select a quote");
            System.out.println("2. Get a random quote");
            System.out.print("Enter the number corresponding to your choice: ");

            try
            {
                int choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.print("Please a number between 1 and 10 to get a famous quote: ");
                        int number = scanner.nextInt();

                        if (number >= 1 && number <= 10)
                        {
                            System.out.println("Quote " + number + ": " + quotes[number - 1]);
                            System.out.println();
                            System.out.print("Do you want to see another quote? (yes/no): ");
                            String userChoice = scanner.next().toLowerCase();
                            if (!userChoice.equals("yes"))
                            {
                                moreQuotes = false;
                            }
                        }
                        else
                        {
                            System.out.println("Invalid input.  Returning to Home Page.");
                        }
                        break;

                    case 2:
                        int randomIndex = random.nextInt(quotes.length);
                        System.out.println("Random Quote: " + quotes[randomIndex]);
                        System.out.print("Do you want to see another quote? (yes/no): ");
                        String userChoice = scanner.next().toLowerCase();
                        if (!userChoice.equals("yes"))
                        {
                            moreQuotes = false;
                        }
                        break;

                    default:
                        System.out.println("Invalid option. Please enter 1 or 2.");
                }
            }

            catch (Exception ex)
            {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
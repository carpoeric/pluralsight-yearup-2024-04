package com.pluralsight;

import java.util.Scanner;

public class Main
{
    private static Scanner userInput = new Scanner(System.in);

    // Constants
    static final String PRODUCT_SIXER = "Sixer";
    static final double PRODUCT_SIXER_PRICE = 5.49;
    static final String PRODUCT_FOOTLONG = "Footlong";
    static final double PRODUCT_FOOTLONG_PRICE = 8.49;
    static final double LOADED_COST_SIXER = 1.00;
    static final double LOADED_COST_FOOTLONG = 1.75;


    public static void main(String[] args)
    {
        //variables
        String customerName;
        int productId;
        double totalPrice;

        customerName = getName();
        displayProducts(customerName);
        productId = getSelectedProductId();

        //Age
        int age = getAge();

        //loaded?
        boolean loadedSammie = getLoaded();


        //calculations
        double sandwichPrice;
        if (productId== 1) {
            totalPrice = calculateTotal(PRODUCT_SIXER_PRICE, age, loadedSammie);
        } else if (productId == 2) {
            totalPrice = calculateTotal(PRODUCT_FOOTLONG_PRICE, age, loadedSammie);
        } else {
            System.out.println("Sorry, that's not an option...");
            return;
        }


        // Display
        System.out.println();
        System.out.printf("Thank you, %s! \n", customerName);
        System.out.printf("Total: $ %6.2f \n", totalPrice);

    }

    public static void displayProducts(String name)
    {
        System.out.println();
        System.out.printf("Welcome to Grubway, %s. Have a sandwich! \n", name);
        System.out.printf("1. %s - $ %.2f \n", PRODUCT_SIXER, PRODUCT_SIXER_PRICE);
        System.out.printf("2) %s - $ %.2f \n", PRODUCT_FOOTLONG, PRODUCT_FOOTLONG_PRICE);
        System.out.println();
    }

    public static String getName()
    {
        System.out.println("What's your name? ");
        return userInput.nextLine();
    }

    public static int getSelectedProductId()
    {
        System.out.println("What Size of sandwich? (1 or 2) ");
        return  userInput.nextInt();
    }

    public static boolean getLoaded()
    {
        System.out.print("Do you want it LOADED? (yes/no): ");
        String response = userInput.next();
        return response.equalsIgnoreCase("yes");
    }

    public static int getAge()
    {
        System.out.print("Please enter your age: ");
        return userInput.nextInt();
    }

    public static double calculateTotal(double price, int age, boolean loadedSammie)
    {
        double totalPrice = price ;
        if (age <= 17)
        { // Students
            totalPrice *= 0.9; // 10% discount
        }
        else if (age >= 65)
        { // Seniors
            totalPrice *= 0.8; // 20% discount
        }

        if (loadedSammie)
        {
            if (price == PRODUCT_SIXER_PRICE)
            {
                totalPrice += LOADED_COST_SIXER;
            }
            else if (price == PRODUCT_FOOTLONG_PRICE)
            {
                totalPrice += LOADED_COST_FOOTLONG;
            }
        }
        return totalPrice;
    }
}

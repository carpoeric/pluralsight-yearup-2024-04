package com.pluralsight;

import java.util.Scanner;

public class Main
{
    static final Scanner userInput = new Scanner(System.in);
    static final int MAX_VEHICLES = 20;
    static int vehicleCount = 0;
    static Vehicle[] vehicles = new Vehicle[MAX_VEHICLES];

    public static void main(String[] args)
    {
        // Preload the array with vehicles
        preloadVehicles();

        int choice = 0;
        while (choice != 6)
        {
            // print the home screen
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.println();
            System.out.println("Enter your command:");
            choice = Integer.parseInt(userInput.nextLine());

            switch (choice)
            {
                case 1:
                    listAllVehicles(vehicles);
                    break;
                case 2:
                    searchByMakeModel(vehicles);
                    break;
                case 3:
                    searchByPrice(vehicles);
                    break;
                case 4:
                    searchByColor(vehicles);
                    break;
                case 5:
                    addVehicle(vehicles);
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }

    public static void preloadVehicles()
    {
        // Preloading vehicles
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevy Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        vehicleCount = 6;
    }

    public static void listAllVehicles(Vehicle[] vehicles)
    {
        System.out.println("Listing all vehicles:");
        for (int i = 0; i < vehicleCount; i++)
        {
            System.out.println("Vehicle " + (i + 1) + ":");
            System.out.println(vehicles[i]);
            System.out.println();
        }
    }

    public static void searchByMakeModel(Vehicle[] vehicles)
    {
        // get user search criteria

        // loop through vehicles and print only vehicles that match the search
    }

    public static void searchByPrice(Vehicle[] vehicles)
    {
        // get user search criteria

        // loop through vehicles and print only vehicles that match the search
    }

    public static void searchByColor(Vehicle[] vehicles)
    {
        // get user search criteria

        // loop through vehicles and print only vehicles that match the search
    }

    public static void addVehicle(Vehicle[] vehicles)
    {
        if (vehicleCount < MAX_VEHICLES)
        {
            // get user input for vehicle details
            System.out.println("Enter Vehicle ID:");
            long vehicleId = Long.parseLong(userInput.nextLine());
            System.out.println("Enter Make/Model:");
            String makeModel = userInput.nextLine();
            System.out.println("Enter Color:");
            String color = userInput.nextLine();
            System.out.println("Enter Odometer Reading:");
            int odometerReading = Integer.parseInt(userInput.nextLine());
            System.out.println("Enter Price:");
            float price = Float.parseFloat(userInput.nextLine());

            // create a new vehicle
            vehicles[vehicleCount] = new Vehicle(vehicleId, makeModel, color, odometerReading, price);

            // add it to the inventory
            vehicleCount++;

            System.out.println("Vehicle added successfully!");
        }
        else
        {
            System.out.println("Cannot add more vehicles. Maximum capacity reached.");
        }
    }
}
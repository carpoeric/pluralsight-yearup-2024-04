package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Cell 1
        CellPhone myPhone1 = new CellPhone();

        System.out.println("Please enter the following information for the first phone:");
        enterPhoneInformation(scanner, myPhone1);

        // Cell 2
        CellPhone myPhone2 = new CellPhone();

        System.out.println("\nPlease enter the following information for the second phone:");
        enterPhoneInformation(scanner, myPhone2);

        // Display
        System.out.println("\nHere's the info for the first phone!");
        display(myPhone1);
        System.out.println("\nHere's the info for the second phone!");
        display(myPhone2);

        System.out.println("\nPhone 1 is calling Phone 2... ");
        myPhone1.dial(myPhone2.getPhoneNumber());

        System.out.println("\nPhone 2 is calling phone 1...");
        myPhone2.dial(myPhone1.getPhoneNumber());

        scanner.close();
    }

        //  User Prompts
    private static void enterPhoneInformation(Scanner scanner, CellPhone phone)
    {
        System.out.print("What is the Serial Number: ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("What model: ");
        String model = scanner.nextLine();
        System.out.print("What carrier: ");
        String carrier = scanner.nextLine();
        System.out.print("What is the phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Owner: ");
        String owner = scanner.nextLine();

        //Setters
        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);
    }

        // Display
    public static void display(CellPhone phone)
    {
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}

class CellPhone
{
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // constructors
    public CellPhone()
    {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
    // G&S
    public int getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getCarrier()
    {
        return carrier;
    }

    public void setCarrier(String carrier)
    {
        this.carrier = carrier;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public void dial(String numberToDial)
    {
        System.out.println(owner + "'s phone is calling " + numberToDial);
    }
}
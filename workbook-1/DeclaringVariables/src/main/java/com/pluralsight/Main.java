package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        // declare variables for each of the following:


        // a vehicle identification number in the range 1000000 - 9999999
        int idNumber;
        idNumber = 1000001;
        System.out.println("Vehicle ID Number: " + idNumber);

        // a vehicle make /model (i.e. Ford Explorer)
        String vModel = "Ford Explorer";
        System.out.println("Vehicle Model: " + vModel);



        // a vehicle color
        String vColor = "White";
        System.out.println("Color: " + vColor);


        // whether the vehicle has a towing package
        boolean towPack = true;
        System.out.println("Tow Package? " + towPack);


        // an odometer reading
        byte odReading;
        odReading = 123;
        System.out.println("Odometer Reading: " + odReading);


        // a price
        double vPrice;
        vPrice = 10000.99;
        System.out.println("Vehicle Price: " + vPrice);


        // a quality rating (A, B, or C)\
        char qRating = 'F';
        System.out.println("Vehicle Quality Rating: " + qRating);

        // a phone number
        String pNumber = "(678)999-8212";
        System.out.println("Phone Number: " + pNumber);


        // a social security number
        int sNumber;
        sNumber = 123445678;
        System.out.println("SSN: " + sNumber);


        // a zip code
        int zCode;
        zCode = 69420;
        System.out.println("Zip Code: " + zCode);



    }
}
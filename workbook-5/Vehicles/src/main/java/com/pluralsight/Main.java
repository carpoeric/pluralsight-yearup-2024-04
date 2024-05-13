package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Moped slowRide = new Moped("Red",1,0,5);
        Car coupe = new Car("Blue",4,5,10);
        SemiTruck uHaul = new SemiTruck("Yellow",20,10,20);
        Hovercraft flyingRide = new Hovercraft("White",6,0,40);


        //print test
        System.out.println("Moped:");
        System.out.println("Color: " + slowRide.getColor());
        System.out.println("Number of Passengers: " + slowRide.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + slowRide.getCargoCapacity());
        System.out.println("Fuel Capacity: " + slowRide.getFuelCapacity());
        System.out.println();

        System.out.println("Car:");
        System.out.println("Color: " + coupe.getColor());
        System.out.println("Number of Passengers: " + coupe.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + coupe.getCargoCapacity());
        System.out.println("Fuel Capacity: " + coupe.getFuelCapacity());
        System.out.println();

        System.out.println("Semi-Truck:");
        System.out.println("Color: " + uHaul.getColor());
        System.out.println("Number of Passengers: " + uHaul.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + uHaul.getCargoCapacity());
        System.out.println("Fuel Capacity: " + uHaul.getFuelCapacity());
        System.out.println();

        System.out.println("Hovercraft:");
        System.out.println("Color: " + flyingRide.getColor());
        System.out.println("Number of Passengers: " + flyingRide.getNumberOfPassengers());
        System.out.println("Cargo Capacity: " + flyingRide.getCargoCapacity());
        System.out.println("Fuel Capacity: " + flyingRide.getFuelCapacity());
        System.out.println();
    }
}
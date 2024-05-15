package com.pluralsight;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("1 First St.", 2, 2300, 6000, "My casa", "10/20/2023", 600000));
        assets.add(new House("2 Second St.", 1, 4000, 8000, "Vacation casa", "10/21/2024", 1000000));

        assets.add(new Vehicle("Toyota Corolla", 2016, 90000, "Groceries and errands Car", "12/24/2015", 30000));
        assets.add(new Vehicle("Honda NSX", 2022, 12000, "Groceries Car, but make it Whole Foods", "01/15/2024", 180000));

        for (Asset asset : assets)
        {

            if (asset instanceof House)
            {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            }
            else if (asset instanceof Vehicle)
            {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
            }

            System.out.println("Desc: " + asset.getDescription());
            System.out.println("Date: " + asset.getDateAcquired());
            System.out.println("OG Cost: $" + asset.getOriginalCost());
            System.out.println("Current Cost: $" + asset.getValue());
            System.out.println();

        }
    }
}
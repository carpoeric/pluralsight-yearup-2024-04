package com.pluralsight;

class Vehicle extends Asset
{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String makeModel, int year, int odometer, String description, String dateAcquired, double originalCost)
    {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel()
    {
        return makeModel;
    }

    public void setMakeModel(String makeModel)
    {
        this.makeModel = makeModel;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getOdometer()
    {
        return odometer;
    }

    public void setOdometer(int odometer)
    {
        this.odometer = odometer;
    }

    @Override
    public double getValue()
    {
        int age = 2024 - year;
        double value;
        if (age <= 3)
        {
            value = getOriginalCost() * Math.pow(0.97, age);
        }
        else if (age <= 6)
        {
            value = getOriginalCost() * Math.pow(0.94, age);
        }
        else if (age <= 10)
        {
            value = getOriginalCost() * Math.pow(0.92, age);
        }
        else
        {
            value = Math.max(1000, getOriginalCost());
        }
        if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota")))
        {
            value *= 0.75;
        }
        return value;
    }
}
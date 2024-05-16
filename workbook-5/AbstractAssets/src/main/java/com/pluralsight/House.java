package com.pluralsight;

class House extends Asset
{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String address, int condition, int squareFoot, int lotSize, String description, String dateAcquired, double originalCost)
    {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getCondition()
    {
        return condition;
    }

    public void setCondition(int condition)
    {
        this.condition = condition;
    }

    public int getSquareFoot()
    {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot)
    {
        this.squareFoot = squareFoot;
    }

    public int getLotSize()
    {
        return lotSize;
    }

    public void setLotSize(int lotSize)
    {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue()
    {
        double value = 0;
        switch (condition)
        {
            case 1:
                value = 180 * squareFoot;
                break;
            case 2:
                value = 130 * squareFoot;
                break;
            case 3:
                value = 90 * squareFoot;
                break;
            case 4:
                value = 80 * squareFoot;
                break;
        }
        value += 0.25 * lotSize;
        return value;
    }
}
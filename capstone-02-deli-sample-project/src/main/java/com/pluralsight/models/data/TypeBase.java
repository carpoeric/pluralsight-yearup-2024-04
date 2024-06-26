package com.pluralsight.models.data;

public abstract class TypeBase
{
    private int id;
    private int displayOption;
    private String category;
    private String name;

    public TypeBase(int id, int displayOption, String category, String name)
    {
        this.id = id;
        this.displayOption = displayOption;
        this.category = category;
        this.name = name;
    }

    public TypeBase()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getDisplayOption()
    {
        return displayOption;
    }

    public void setDisplayOption(int displayOption)
    {
        this.displayOption = displayOption;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

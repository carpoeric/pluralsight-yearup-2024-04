package com.pluralsight;

public class BankAccount implements Valuable
{
    private String name;
    private double accountNumber;
    private double balance;

    public BankAccount(double accountNumber, String name, double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    @Override
    public double getValue()
    {
        return balance;
    }
}

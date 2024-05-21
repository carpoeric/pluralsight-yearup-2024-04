package com.pluralsight;

public class FinanceApplication {
    public static void main(String[] args)
    {

        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        Valuable account2 = new BankAccount(456, "Gary", 1500);

        // Try to deposit money into both accounts
        // account1.deposit(100); // Uncomment to test deposit method
        // account2.deposit(100); // Uncomment to test deposit method
    }
}
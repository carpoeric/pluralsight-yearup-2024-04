package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        formatPhoneNumber();
    }

    public static void formatPhoneNumber()
    {
        String phoneNumber = "8885551212";
        String formattedPhone;

        String areaCode = phoneNumber.substring(0,3);
        String prefix = phoneNumber.substring(4,7);
        String last4 = phoneNumber.substring(6)

        System.out.println("area code: " + areaCode);
        System.out.println("prefix: " + prefix);
        System.out.println("last 4: " + last4);


    }
}
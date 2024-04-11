package com.pluralsight;

public class MathApp
{
    public static void main(String[] args)
    {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1()
    {
        // Question 1:
        // declare variables here
        double bobSalary = 10000;
        double garySalary = 20000;
        double highestSalary = Math.max(bobSalary, garySalary);



        // code the logic to the problem here
        Math.max(bobSalary, garySalary);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The highest salary is: $" + highestSalary);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2()
    {
        // Question 2:
        // declare variables here
        double carPrice = 3000;
        double truckPrice = 1500;
        double lowestPrice = Math.min(carPrice, truckPrice);


        // code the logic to the problem here
        Math.min(carPrice, truckPrice);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The lowest vehicle price is: $" + lowestPrice);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3()
    {
        // Question 3:
        // declare variables here
        double radiusCircle = 7.25;


        // code the logic to the problem here
        double area = (Math.PI * radiusCircle * radiusCircle);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The area of the circle whose radius is " + radiusCircle + " is:" + area) ;
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4()
    {
        // Question 4:
        // declare variables here
        double numVariable = 5.0;


        // code the logic to the problem here
        double squareRoot = Math.sqrt(numVariable);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The square root of " + numVariable + " is: " + squareRoot);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5()
    {
        // Question 5:
        // declare variables here
        // First Point -
        double pointX1 = 5;
        double pointY1 = 10;
        // Second Point -
        double pointX2 = 85;
        double pointY2 = 50;


        // code the logic to the problem here
        double pointDistance = Math.sqrt(Math.pow(pointX2 - pointX1, 2) + Math.pow(pointY2 - pointY1, 2));
        // equation is distance = sqrt[ (x2-x1)^2 + (y2-y1)^2 ]


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The distance between the points is: " + pointDistance);

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6()
    {
        // Question 6:
        // declare variables here
        double numVariable = -3.8;


        // code the logic to the problem here
        double absoluteValue = Math.abs(numVariable);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The absolute value of " + numVariable + " is: " +  absoluteValue);
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7()
    {
        // Question 7:
        // declare variables here
        double randomNumber = Math.random();
;

        // code the logic to the problem here



        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Random number from 0 to 1: " + randomNumber);

    }
}
package com.pluralsight;

public class RollTheDice
{
    public static void main(String[] args)
    {
        //Variables
        Dice dice = new Dice();
        int die1;
        int die2;
        int diceCount2 = 0;
        int diceCount4 = 0;
        int diceCount6 = 0;
        int diceCount7 = 0;


        for (int i = 0; i < 100; i++)
        {
            die1 = dice.rollDice();
            die2 = dice.rollDice();

            //Display for rolls
            System.out.println("Dice roll #" + (i + 1) + ": " + die1 + " and " + die2) ;

            // Sum of rolls
            int sum = die1 + die2;
            if (sum == 2)
            {
                diceCount2++;
            }

            else if (sum == 4)
            {
                diceCount4++;
            }

            else if (sum == 6)
            {
                diceCount6++;
            }

            else if (sum == 7)
            {
                diceCount7++;
            }
        }

        //Display
        System.out.println("--------------------------");
        System.out.println("Number of times 2 is rolled: " + diceCount2);
        System.out.println("Number of times 4 is rolled: " + diceCount4);
        System.out.println("Number of times 6 is rolled: " + diceCount6);
        System.out.println("Number of times 7 is rolled: " + diceCount7);
    }
}
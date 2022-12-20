/**
* Project2.java
* Emma Lucas
*
* This program manages user selection for basketball tickets 
* and calculates the price based on the user's selection.
*/

import java.util.*;

public class Project2 {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        final int STUDENT = 50; //student get half price tickets
        final int ALUMNI = 90; //alumni get 10% discount
        final int FACULTY = 85; //faculty get 15% discount 
        final int MILITARY = 80; //military get 20% dicount
        final int GENERAL = 100; //cost of general public tickets
        final double TAX = 1.08;
        final int PARKING = 30; //cost of parking

        System.out.println("**Welcome to the Big 12 Men's Basketball Tournament App**");
        System.out.println("  March 9-12, 2022 at the Sprint Center in Kansas City!");
        System.out.println();

        System.out.println("Please select from the following categories: ");
        System.out.println("1) Student");
        System.out.println("2) Alumni");
        System.out.println("3) Faculty & Staff");
        System.out.println("4) Military");
        System.out.println("5) General Public");
        System.out.println();
        
        int selection = -1;
        while (selection < 1 || selection > 5)
        {
            System.out.print("Enter selection (1-5): ");
            selection = Integer.parseInt(s.nextLine());
            if (selection < 1 || selection > 5)
            {
                System.out.println("Invalid selection.");
            }
        }
        System.out.println();

        System.out.print("Enter number of tickets you want to purchase: ");
        int numTickets = Integer.parseInt(s.nextLine());
        System.out.println();

        System.out.print("Would you like to purchase a parking pass? (y)es or (n)o: ");
        char parking = s.nextLine().toLowerCase().charAt(0);
        System.out.println();
        int parkingCost = 0;
        boolean parkingPass = false;
        if (parking == 'y')
        {
            parkingCost = PARKING;
            parkingPass = true;
        }

        double ticketCost = 100; 
        if (selection == 1)
        {
            ticketCost = STUDENT;
        }
        else if (selection == 2)
        {
            ticketCost = ALUMNI;
        }
        else if (selection == 3)
        {
            ticketCost = FACULTY;
        }
        else if (selection == 4)
        {
            ticketCost = MILITARY;
        }

        double cost = (ticketCost * numTickets * TAX) + parkingCost;
        if (parkingPass)
        {
            System.out.printf("You ordered %d tickets with parking and tax for a total cost of $%.2f", numTickets, cost);
        }
        else 
        {
            System.out.printf("You ordered %d tickets without parking and tax for a total cost of $%.2f", numTickets, cost);
        }
        System.out.println();

        System.out.print("Enjoy the game and Go Cats!!");
        System.out.println();
    }
}
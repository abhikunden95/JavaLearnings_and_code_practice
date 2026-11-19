/*
Ask the user for their name and greet them.
        Ask for the total bill amount.
Ask how many people are splitting it.
Calculate and print how much each person pays.
Calculate and print the remainder that doesn’t split evenly, using %. You’ll need an int variable for the number of people.*/

package userInteractions;
import java.util.Scanner;

public class BillSplitter {
    public static void main (String[] args) {

        System.out.print("Kindly mention your name: ");

        Scanner input = new Scanner (System.in);

        String name = input.nextLine();

        System.out.println("Thank you, " + name + " please wait till I generate your bill amount");

        System.out.print("Enter total bill amount :");

        double bill = input.nextDouble();

        System.out.print("How many people would you like to split the " + bill + " with?: ");

        int people = input.nextInt();

        double equalSplit = bill / people;

        double remainderSplit = bill % people;

        System.out.println("Thank you, the equal share for " + people + " would be " + String.format("%.2f",equalSplit) + " and remaining share would be " + remainderSplit);

        input.close();

    }
}
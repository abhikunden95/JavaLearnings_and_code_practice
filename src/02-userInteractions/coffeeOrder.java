/*
Ask the customer for their name and print a greeting.
Ask for the price of one coffee and how many they want.
Calculate and print the total cost.
Ask for a tip amount, add it to the total, and print the final amount.*/

import java.util.Arrays;
import java.util.Scanner;

public class coffeeOrder {
    public static void main (String[] args) {

        System.out.print("Kindly mention your name :");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println("Welcome to Abhi's coffee shop " + name);

        System.out.print("How many coffee's do you want? : ");

        int count = input.nextInt();

        System.out.println("Thank you let me calculate the amount for " + count + " coffee's");

        Double price = 239.5;

        Double billAmount = price * count;

        System.out.println("Your " + count + " coffee's will cost you: " + billAmount);

        System.out.print("Do you want to give any tip? : ");

        Double tip = input.nextDouble();

        Double finalPrice = billAmount + tip;

        System.out.println("Your final amount will be : " + finalPrice);
    }
}


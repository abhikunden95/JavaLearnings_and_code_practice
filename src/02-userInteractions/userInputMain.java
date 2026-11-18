/*Ask the user for their name and print a welcome message that includes it.
Store a starting balance of 5000 in a variable.
Ask how much they want to deposit, add it to the balance, and print the new balance.
Ask how much they want to withdraw, subtract it, and print the new balance.*/

import java.util.Arrays;
import java.util.Scanner;

public class userInputMain {
    public static void main (String[] args) {

        System.out.print("Kindly Enter your Name : ");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println("Welcome " + name + " We are happy to see you");

        Double balance = 5000.0;

        System.out.print("How much would you want to deposit : ");
        Double newbalance = input.nextDouble();
        Double balance2 = newbalance + balance;
        System.out.println("The new balance is: " + balance2);

        System.out.print("How much would you want to withdraw : ");
        Double newwithdraw = input.nextDouble();
        Double balance3 = balance2 - newwithdraw;
        System.out.println("The new balance is: " + balance3);

        input.close();
    }
}
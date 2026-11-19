/*Ask for the customer’s name and greet them.
        Ask for the food total, the GST percentage, and the service charge percentage.
Calculate the GST amount and the service charge amount. Each one is a percentage of the food total.
Calculate and print the grand total: food plus GST plus service charge.
Ask how many people are paying, then calculate and print the amount each person pays, with the amounts shown to two decimal places.*/

package userInteractions;
import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {

        System.out.print("Kindly mention your name: ");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println("Thank you for visiting the cafe " + name + " kindly wait till I get you the final bill");

        System.out.print("Kindly mention your food total: ");

        System.out.print("Kindly mention your GST %: ");

        System.out.print("Kindly mention your service charge %: ");

        double foodTotal = input.nextDouble();

        double gstPercentage = input.nextDouble();

        double serviceChargePercentage = input.nextDouble();

        double gstTotal = (foodTotal + (gstPercentage/100));
        double serviceChargeTotal = (foodTotal + (serviceChargePercentage/100));
        double finalBill = foodTotal + gstTotal + serviceChargeTotal;



    }
}

package userInteractions;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main (String[] args) {

        int a, b, temp;

        System.out.print("Enter first number : ");

        Scanner input = new Scanner(System.in);

        a = input.nextInt();

        System.out.print("Enter second number : ");

        b = input.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println ("The first value is : " + a + " the second value is : " + b);

    }
}

package Undervisning_21_09_2020.Chaper_03;

import java.util.Scanner;
//Program som bruger modulus % til at finde resten af number / 2
//Program som bruger modulus % til at finde resten af number / 3

//Program som bruger modulus % til at finde resten af number / 2

//Programmet souter if "rest int = 0"
public class TestBooleanOperators {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive an input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is " + number + " divisible by 2 and 3? " +
                ((number % 2 == 0) && (number % 3 == 0)));

        System.out.println("Is " + number + " divisible by 2 or 3? " +
                ((number % 2 == 0) || (number % 3 == 0)));

        System.out.println("Is " + number +
                " divisible by 2 or 3, but not both? " +
                ((number % 2 == 0) ^ (number % 3 == 0)));
    }
}

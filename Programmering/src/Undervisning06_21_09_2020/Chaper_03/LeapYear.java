package Undervisning06_21_09_2020.Chaper_03;

import java.util.Scanner;
//Programmet beregner med om det inputtede år, er et skud år. Programmet bruger modulus (%) til denne beregning
public class LeapYear {
    public static void main(String args[]) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display the result in a message dialog box
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}

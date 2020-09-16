package Kodeværksted_Refaktorering_02;
// 1. Gennemgå og forstå koden.
// 2. Refaktorer klassens navn, variable, metoder og tekster til dansk.
// 3. Træk klassens funktionalitet ud i nye metode(r).
// 4. Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.

import java.util.Scanner;

public class FahreinheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " +
                celsius + " in Celsius");
    }
}

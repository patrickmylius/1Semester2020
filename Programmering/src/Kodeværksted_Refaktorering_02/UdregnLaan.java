package Kodeværksted_Refaktorering_02;
// 1. Gennemgå og forstå koden.
// 2. Refaktorer klassens navn, variable, metoder og tekster til dansk.
// 3. Træk klassens funktionalitet ud i nye metode(r).
// 4. Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.

import java.util.Scanner;

public class UdregnLaan {
    public static void main(String[] args) {
        // Instantiere en Scanner
        Scanner input = new Scanner(System.in);

        // Input årlig rentesats
        System.out.print("Input årlig rentesats, for eksempel 8.25: ");
        double aarligRentesats = input.nextDouble();

        // Udregner årlig rente sats
        double maanedligRentesats = aarligRentesats / 1200;

        // Input mængde år
        System.out.print(
                "Input mængde år som tal, for eksempel 5: ");
        int antalAar = input.nextInt();

        // Input låne mængde
        System.out.print("Input lånte beløb, for eksempel 120000.95: ");
        double laaneBeloeb = input.nextDouble();

        // Udregner betaling
        double maanedligBetaling = laaneBeloeb * maanedligRentesats / (1
                - 1 / Math.pow(1 + maanedligRentesats, antalAar * 12));
        double totalBeloeb = maanedligBetaling * antalAar * 12;

        // Udskriver resultat
        System.out.println("Den månedlige beløb til betaling: $" +
                (int) (maanedligBetaling * 100) / 100.0);
        System.out.println("Det totale at betale: $" +
                (int) (totalBeloeb * 100) / 100.0);
    }
}

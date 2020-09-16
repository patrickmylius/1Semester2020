package Kodeværksted_Refaktorering_02;
// 1. Gennemgå og forstå koden.
// 2. Refaktorer klassens navn, variable, metoder og tekster til dansk.
// 3. Træk klassens funktionalitet ud i nye metode(r).
// 4. Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.

import java.util.Scanner;

public class UdregnByttePenge {
    public static void main(String[] args) {
        // Instantiere en Scanner
        Scanner input = new Scanner(System.in);

        // Indtast beløb
        System.out.print(
                "Input et beløb af type double, for eksempel 11.56: ");
        double beloeb = input.nextDouble();
        //udregner resterende beløb
        int resterendeBeloeb = (int) (beloeb * 100);

        // Finder mængden af 1 dollars
        int antalEnDollars = resterendeBeloeb / 100;
        resterendeBeloeb = resterendeBeloeb % 100;

        // Finder mængden af quarters i det resterende beløb
        int antalQuarters = resterendeBeloeb / 25;
        resterendeBeloeb = resterendeBeloeb % 25;

        // Finder mængden af dimes i det resterende beløb
        int antalDimes = resterendeBeloeb / 10;
        resterendeBeloeb = resterendeBeloeb % 10;

        // Finder mængden af nickles i det resterende beløb
        int antalNickles = resterendeBeloeb / 5;
        resterendeBeloeb = resterendeBeloeb % 5;

        // Finder mængden af pennies i det resterende beløb
        int antalPennies = resterendeBeloeb;

        // Udskriver beløb i dollars, quarters, dimes, nickles og pennies
        System.out.println("Dit beløb " + beloeb + " består af");
        System.out.println("    " + antalEnDollars + " dollars");
        System.out.println("    " + antalQuarters + " quarters ");
        System.out.println("    " + antalDimes + " dimes");
        System.out.println("    " + antalNickles + " nickels");
        System.out.println("    " + antalPennies + " pennies");
    }

}

package Undervisning_16_09_2020;
// Gennemse SalesTax klassen i bogen, og forstå, hvordan det virker.
// Refactoring 1: Omskriv SalesTax klassen til dansk (klassenavn Moms, variablenavne på dansk, dansk moms er 25%)
// Refactoring 2: Træk momsberegningen ud i sin egen metode plusMoms().
// Refactoring 3: Lav en ny metode, der kan beregene tysk moms (16%) plusTyskMoms().
// Refactoring 4: Omdøb nu din plusMoms() til plusDanskMoms().

import java.util.Scanner;

public class Opg_Moms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast beløb: ");
        double beløb = input.nextDouble();

        double moms = beløb * 0.25;
        System.out.println("Moms udgør kr: " + (int) (moms * 100) / 100.0);
    }
}

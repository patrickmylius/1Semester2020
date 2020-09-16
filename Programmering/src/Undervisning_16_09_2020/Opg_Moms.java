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

        System.out.print("Ønsker du at beregne tysk eller dansk moms: ");
        String svar = input.nextLine();
        //if loop som kører plusMoms metoden hvis input er lig dansk
        if (svar.equalsIgnoreCase("dansk")) {
            plusDanskMoms();
        }
        //if loop som kører plusTyskMoms metoden hvis input er lig tysk
        if (svar.equalsIgnoreCase("tysk")) {
            plusTyskMoms();
        }
    }

    //Metode plusMoms, bruger beløb til at beregne moms
    static void plusDanskMoms() {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast beløb: ");
        double beløb = input.nextDouble();
        double moms = beløb * 0.25;
        System.out.println("Moms udgør kr: " + (int) (moms * 100) / 100.0);
    }

    //Metode til tysk moms beregning, tager input og beregner tysk moms
    static void plusTyskMoms() {
        Scanner input = new Scanner(System.in);

        System.out.print("Menge eingeben: ");
        double beløb = input.nextDouble();
        double moms = beløb * 0.16;
        System.out.println("Mehrwertsteuer bildet: " + (int) (moms * 100) / 100.0);
    }

}

package Undervisning_16_09_2020;
//Opret en ny java-fil, som indeholder eksempler på alle ovenstående datatyper.
// Sørg for, at du både skriver værdier i variablen,
// men også at du læser værdierne fra variablen.
import java.util.Scanner;

public class Opg_Variabler {

    public static void main(String[] args) {

        adresseInfo();

    }
    public static void adresseInfo(){
        Scanner input = new Scanner(System.in);
        boolean adresseVærdi = false;

        System.out.print("Navn: ");
        String navn = input.next();
        System.out.print("Vejnavn: ");
        String vejNavn = input.next();

        System.out.print("Vej nummer: ");
        short vejNummer = input.nextShort();

        System.out.print("Post nummer: ");
        int postNr = input.nextInt();

        System.out.print("Køn: ");
        String køn = input.next();

        adresseVærdi = true;

        if (adresseVærdi) {
            System.out.println("Fornavn: " + navn);
            System.out.println("Adresse: " + vejNavn + " nr. " + vejNummer);
            System.out.println("Post nummer: " + postNr);
            System.out.println("Køn: " + køn);

            System.out.println("");

        }
    }
    }

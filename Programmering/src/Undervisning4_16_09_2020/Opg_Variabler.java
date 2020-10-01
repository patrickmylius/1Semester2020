package Undervisning4_16_09_2020;
//Opret en ny java-fil, som indeholder eksempler på alle ovenstående datatyper.
// Sørg for, at du både skriver værdier i variablen,
// men også at du læser værdierne fra variablen.

import java.util.Scanner;

public class Opg_Variabler {

    public static void main(String[] args) {
        adresseInfo();//Metode som souter given adresse info
        System.out.println("");
        System.out.println("");
        infoOmLong();//Metode printer sout m. long
        charUdskrift(); //Metode som souter chars
        floatUdskrift();//Metoder som konvertere en string til float og souter
    }

    //metode som souter inputs
    static void adresseInfo() {
        Scanner input = new Scanner(System.in);
        boolean personOplysninger = false; //variable boolean

        System.out.print("Navn: ");
        String navn = input.next(); //variable type String (ikke primitiv data-type, men en klasse)
        System.out.print("Vejnavn: ");
        String vejNavn = input.next(); //variable type String (ikke primitiv data-type, men en klasse)

        System.out.print("Vej nummer: ");
        short vejNummer = input.nextShort(); //variable type short
        System.out.print("Post nummer: ");
        short postNr = input.nextShort(); //variable type short

        System.out.print("Køn: ");
        String køn = input.next(); //variable type String

        System.out.print("Alder: ");
        byte alder = input.nextByte(); //variable type byte

        System.out.print("Højde: ");
        double hoejde = input.nextDouble(); //variable type double
        System.out.print("Vægt: ");
        double vaegt = input.nextDouble(); //variable type double

        personOplysninger = true; //variable boolean set to true

        //if loop som printer personoplysninger, hvis (personOplysninger = true)
        if (personOplysninger) {
            System.out.println("Fornavn: " + navn);
            System.out.println("Adresse: " + vejNavn + " nr. " + vejNummer);
            System.out.println("Post nummer: " + postNr);
            System.out.println("");
            System.out.println("Køn: " + køn);
            System.out.println("Alder: " + alder);
            System.out.println("Højde: " + hoejde);
            System.out.println("Vægt: " + vaegt);


        }
    }//metode som instantiere og bruger 2 variabler af typen long
    static void infoOmLong(){
        long max = 9223372036854775807L;
        long min = -9223372036854775808L;

        System.out.println("This is the biggest possible long in (+) value: " + max);
        System.out.println("This is the biggest possible long in (-) value: " + min);

    } //metode som instantiere et array af typen char og souter alle chars.
    static void charUdskrift(){
        char[] charArray = {'P', 'R', 'O', 'G','R', 'A', 'M', 'M','E', 'R','I','N','G'};
        System.out.println(charArray);
    }
    //Metode som konvertere strings og returnere souts + floats
    static void floatUdskrift(){
        String decimal = "300.30";
        float f = Float.parseFloat(decimal);
        System.out.println("String '300.30' konveret til float " + decimal + " is: " + f);

        f = Float.parseFloat("200.20");
        System.out.println("String '200' konverteret til float : " + f);

        String b = "1.10";
        float number = Float.valueOf(b);
        System.out.println("String '1,1' konverteret til float : " + number);
    }
}

package Kodeværksted_Refaktorering_02;
// 1. Gennemgå og forstå koden.
// 2. Refaktorer klassens navn, variable, metoder og tekster til dansk.
// 3. Træk klassens funktionalitet ud i nye metode(r).
// 4. Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.

import java.util.Scanner;

public class FahreinheitTilCelsius {
    public static void main(String[] args) {
    konverterFahreinheitTilCelsius();//metode kald
    }
    //metode som beregner celsius ud fra inputtet fahreinheit
    static void konverterFahreinheitTilCelsius() {
        Scanner input = new Scanner(System.in);

        System.out.print("Tilføj en temperatur i fahreinheit: ");
        double fahrenheit = input.nextDouble();

        // Konvertere fahreinheit til celcius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " +
                celsius + " i Celsius");

    }
}

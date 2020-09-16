package Kodeværksted_Refaktorering_02;
// 1. Gennemgå og forstå koden.
// 2. Refaktorer klassens navn, variable, metoder og tekster til dansk.
// 3. Træk klassens funktionalitet ud i nye metode(r).
// 4. Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.

import java.util.Scanner;

public class visTid {
    public static void main(String[] args) {
    sekundTilMinut();//metode, kaldt fra main

    }
    //metode som beregner den indtaste mængde sekunder om til minutter
    static void sekundTilMinut() {
        Scanner input = new Scanner(System.in);
        // souter bruger efter et input
        System.out.print("Indtast et tal for sekunder: ");
        int sekunder = input.nextInt();

        int minutter = sekunder / 60; // udregner minutter i sekunder
        int resterendeSekunder = sekunder % 60; // resterende sekunder
        System.out.println(sekunder + " sekunder er " + minutter +
                " minutter og " + resterendeSekunder + " sekunder");
    }
}

package Kodeværksted_Refaktorering_02;

// 1. Gennemgå og forstå koden.
// 2. Refaktorer klassens navn, variable, metoder og tekster til dansk.
// 3. Træk klassens funktionalitet ud i nye metode(r).
// 4. Kald dine nye metoder fra main() - så vi kan se, at det rent faktisk virker.

public class visNuvaerendeTid {
    public static void main(String[] args) {
        // Finder den totale mængde milisekunder siden, Jan 1, 1970
        long totalMilisekunder = System.currentTimeMillis();

        // Finder den totale mængde sekunder siden, Jan 1, 1970
        long totalSekunder = totalMilisekunder / 1000;

        // udregner og finder det nuværende sekund
        long sekundNu = totalSekunder % 60;

        // Finder den totale mængde minutter
        long totalMinutter = totalSekunder / 60;

        // Udregner det nuværende minut
        long minutNu = totalMinutter % 60;

        // finder den totale mængde timer
        long totalTimer = totalMinutter / 60;

        // Udregner nuværende time
        long timeNu = (totalTimer % 24) + 2; //my system hour is 2 hours behind, + 2 explanation.

        // Souter resultat
        System.out.println("Klokken er nu " + timeNu+ ":"
                + minutNu + ":" + sekundNu + " GMT");
    }
}

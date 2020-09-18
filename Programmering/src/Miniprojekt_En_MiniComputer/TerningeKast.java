package Miniprojekt_En_MiniComputer;

import java.util.ArrayList;

public class TerningeKast {
    static final int ANTAL_KAST = 5;

    public static void terningeKast() {
        System.out.println("T E R N I N G E  S P I L");

        System.out.println("    _______________________");
        System.out.println("  //                     //|");
        System.out.println(" //_____________________// |");
        System.out.println("||                     ||  |");
        System.out.println("||  ####         ####  ||  |");
        System.out.println("||  ####         ####  ||  |");
        System.out.println("||                     ||  |");
        System.out.println("||        ####         ||  |");
        System.out.println("||        ####         ||  |");
        System.out.println("||                     ||  |");
        System.out.println("|| ####          ####  ||  |");
        System.out.println("|| ####          ####  ||  /");
        System.out.println("||_____________________||_/");


        System.out.println("Terningen er kastet: ");

        System.out.println("Der er kastet " + ANTAL_KAST + " gange: ");
        ArrayList liste = Terning.flereKast(ANTAL_KAST);
        liste.forEach((n) -> System.out.println(n));
    }
}

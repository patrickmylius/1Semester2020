package Miniprojekt_En_MiniComputer;
// Vi skal bygge en applikation til en tekstbaseret minicomputer,
// som kan løse forskellige opgaver for brugeren.

import java.util.Scanner;

public class MiniComputer {
    public static void main(String[] args) {
        System.out.println("Velkommen");

        //fori loop, køres 5 gange.
        for (int i = 0; i < 5; i++) {
            System.out.print("Hvilke miniprogram vil du køre [1....9]?: ");

            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            //if loop, souter fejl hvis indtasting er uden for tal rammen 1-9
            if (x < 1 || x > 9){
                System.out.println("FEJL: Input tal mellem 1-9");
            }
            //if loop, brug RandomJoke klasse metode grin
            if (x == 1) {
                RandomJoke.grin();
            }
            //if loop, hvis input = 2, brug terninge kast spillet
            if (x == 2) {
            TerningeKast.terningeKast();
            }
            if (x == 3) {
                EuroToDK.konverter();
            }
            if (x == 4) {
                ForLoop.Run();
            }

        }
        System.out.println("Farvel!");
    }
}

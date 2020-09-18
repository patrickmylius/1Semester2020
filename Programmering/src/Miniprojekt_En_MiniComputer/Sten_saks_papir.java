package Miniprojekt_En_MiniComputer;

import java.util.Scanner;
//Kald ved input nr = 6
public class Sten_saks_papir {
    //Danijel
    public static void StenSaksPapir() {

        Scanner input = new Scanner(System.in);
        System.out.println("Velkommen til sten saks papir\nHvad vælger du, skriv 1, 2 eller 3:\n 1. Sten\n 2. saks\n 3. papir");
        String spiller = input.next();

        double y = (double) (Math.random() * 3.0) + 1;
        int computer = (int) y;


        if (spiller.equals("1") || spiller.equals("sten")) {
            if (computer == 1)
                System.out.println("I valgte begge to sten, det blev uafgjort");
            else if (computer == 2)
                System.out.println("Du valgte sten og computeren valgte Saks, tillykke du vandt");
            else if (computer == 3)
                System.out.println("Du valgte Sten og computeren valgte papir, du tabte desværre");
            else
                System.out.println("Du har tastet forkert");


        } else if (spiller.equals("2") || spiller.equals("saks")) {
            if (computer == 1)
                System.out.println("Du valgte saks og computeren valgte papir, du tabte desværre");
            else if (computer == 2)
                System.out.println("I valgte begge to saks, det blev uafgjort");
            else if (computer == 3)
                System.out.println("Du valgte saks og computer valgte papir, tillykke du vandt");
            else
                System.out.println("Du har tastet forkert");

        } else if (spiller.equals("3") || spiller.equals("papir")) {
            if (computer == 1)
                System.out.println("Du valgte papir og computer valgte sten, tillykke du vandt");
            else if (computer == 2)
                System.out.println("Du valgte sten og computer valgte papir, du tabte desværre");
            else if (computer == 3)
                System.out.println("I valgte begge to papir, det blev uafgjort");
            else
                System.out.println("Du har tastet forkert");
        }
    }
}
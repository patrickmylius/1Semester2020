package Miniprojekt_En_MiniComputer;

import java.util.Scanner;
//KALDT INPUT = 4:
public class ForLoop {
    //Af Mikkel Andreasen

    public static void Run() {
        Scanner keyboard = new Scanner(System.in);
        int antalForsoeg = 0;
        int svaret = 1 + (int) (Math.random() * 999);
        int brugerTal = 0;

        System.out.println(" Jeg tænker på et tal mellem 1 til 1000, Kan du gætte det?  Indtast dit gæt her :");

        while (brugerTal != svaret) { //mens det gættede tal ikke er = svaret
            brugerTal = keyboard.nextInt(); //spøger om input
            antalForsoeg++; //pludser 1 til antal forsøg;


            if (brugerTal > svaret) {
                System.out.println("Det er lavere end dette!");
            } else if (brugerTal < svaret) {
                System.out.println("Det er højere end dette!");
            }

            if (brugerTal == 42) {
                System.out.println("Okay haha meningen ved livet");
            } else if (brugerTal == 47) {
                System.out.println("Ham ingen ser før det er forsent");
            }
        }

        System.out.println("Tilykke!! Du gættede tallet med " + antalForsoeg + " Forsøg!");
        System.out.println("Du kan køre programmet igen, og se om du kan gøre det med mindre forsøg");
        System.out.println(" ");
    }
}

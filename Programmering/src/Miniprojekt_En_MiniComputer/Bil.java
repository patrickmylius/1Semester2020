package Miniprojekt_En_MiniComputer;

import java.util.Scanner;

//Kaldt ved input = 7
public class Bil {
    //Daniella
    public static void funktion() {

        for (int i = 0; i < 5; i++) {

            Scanner input = new Scanner(System.in);

            System.out.print("Bilen har 5 funktioner, vælg mellem 1-5: ");
            int svar = input.nextInt();

            String koer = "Bilen kører";
            String dyt = "Bilen siger dyt dyt";
            String taend = "Bilen tænder for lygterne";
            String sluk = "Bilen slukker";
            String musik = "Bilen spiller noget mega sygt musik";

            if (svar == 1) {
                System.out.println(koer);
            }
            if (svar == 2) {
                System.out.println(dyt);
            }
            if (svar == 3) {
                System.out.println(taend);
            }
            if (svar == 4) {
                System.out.println(sluk);
            }
            if (svar == 5) {
                System.out.println(musik);
            }
            if (svar < 1 || svar > 5) {
                System.out.println("Fejl, vælg et nummer mellem 1 og-5!");
            }
        }
    }
}

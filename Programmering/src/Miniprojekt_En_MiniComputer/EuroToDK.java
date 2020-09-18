package Miniprojekt_En_MiniComputer;

import java.util.Scanner;

public class EuroToDK {
    static double euro;
    static final double DKK = 7.4399;

    public static void konverter() {
        System.out.print("Indtast euro til konvertering: ");

        Scanner input = new Scanner(System.in);
        euro = input.nextDouble();

        double resultat = euro * DKK;

        System.out.println(euro + " euro: " +
                "konveteret til danske kroner: " + resultat + " DK");
    }


}

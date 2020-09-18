package Miniprojekt_En_MiniComputer;

import java.util.Scanner;

//Patrick
public class EuroToDK {
    //instans af final variabler
    static final double VALUTA = 7.4399;
    static final String EU = "euro";
    static final String DK = "kroner";

    //konverter metode som beder om input og udregner valuta
    public static void konverter() {
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Vil du konvertere Euro eller Kroner: ");
            String svar = input.next();

            //if loop, køres til konvertering af Euro til DK
            if (svar.equalsIgnoreCase(EU)) {

                System.out.print("\n" + "Indtast euro til konvertering: ");
                double euro = input.nextDouble();
                double resultatDK = euro * VALUTA;
                //souter resultat
                System.out.println("\n" + euro + " euro: " +
                        "konveteret til danske kroner: " + resultatDK + " DK" + "\n");
            }
            //if loop, køres til konvertering af DK til Euro
            if (svar.equalsIgnoreCase(DK)) {
                System.out.print("Indtast DKK til konvertering: ");
                double kroner = input.nextDouble();
                double resultatEU = kroner / VALUTA;
                //souter resultat
                System.out.println("\n" + kroner + " kroner: " +
                        "konveteret til danske kroner: " + resultatEU + " €" + "\n");
            }
            if (svar != DK && svar != EU) {
                System.out.println("\n" + "Dit input er ugyldigt, prøv igen");

            }
            if (svar == "exit" || svar == "stop" || svar == "quit") {
                break;
            }
        }
    }

}

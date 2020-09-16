// I denne opgave skal vi udvikle en metode meddelFejl, der kan bruges til at udskrive fejlmeddelelser.
// 1. Lav først metode så den udskriver teksten: "Der er en fejl"
//
public class Metoder_02 {
    //metode som souter fejl
    static void meddelFejl() {
        System.out.println("Der er en fejl");
    }

    //metode som tager imod 2x ints som parametre, souter fejl nummer og linje nummer
    static void meddelFejl_2(int lineNumb, int errorNumb) {
        System.out.println("Fejl nr. " + errorNumb + " i linje nummer " + lineNumb);

    }

    //Start
    public static void main(String[] args) {
        meddelFejl();
        meddelFejl_2(14, 5
        );
    }
}

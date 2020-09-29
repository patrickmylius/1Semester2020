// Lav en metode skrivAdresse, der udskriver din eller en andens adresse på tre liner,
// med navn, adresse og postnummer.

public class Metoder_01 {
    //start
    public static void main(String[] args) {
        //method call
        skrivAdresse("batman");
    }

    //methode som tager imod "navn" + indeholder if loop
    static void skrivAdresse(String navn) {
        //if loop is name input is "patrick" or "batman"
        if (navn == "patrick") {
            System.out.println("Astersvej 33" + "\n" + "4600" + "\n" + "Køge");
        }
        if (navn == "batman") {
            System.out.println("The Cave 100" + "\n" + "666" + "\n" + "Gotham City");
        }
        //if loop to catch "Der er sket" en fejl if input string is "patrick"
        if (navn != "batman" && navn != "patrick") {
            System.out.println("Der er sket en fejl");
        }
    }
}

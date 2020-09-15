public class Metoder_03 {

    public static void main(String[] args) {
        //method call
        skrivAdresse("patrick");
    }
    //method
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

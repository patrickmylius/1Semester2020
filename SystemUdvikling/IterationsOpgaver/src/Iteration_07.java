//lav et program der erklærer to varible minimum og maximum,
// sæt den til henholsvis 3 og 16. Udskriver antallet af lige og ulige tal i intervallet
// mellem minimum og maximum
public class Iteration_07 {
    public static void main(String[] args) {
        //sets variable mi
        int min = 3;
        int max = 16;

        int ligeTal = 0;
        int uLigeTal = 0;

        //fori loop, finds odd and even numbers between 3 and 16
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0)
                ligeTal++;
            else
                uLigeTal++;
        }
        //souts text + computed even and odd numbers.
        System.out.println("Der er " + ligeTal + " lige " + " og " + uLigeTal +
                " ulige tal i intervallet [" + min + ":" + max + "]");
    }
}

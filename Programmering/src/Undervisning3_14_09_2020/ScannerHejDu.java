package Undervisning3_14_09_2020;
import java.util.Scanner;
public class ScannerHejDu {
    public static void main(String[] args) {
        //sets Scanner to input
        Scanner input = new Scanner(System.in);
        //souts user for an input in console
        System.out.print("Hvad er dit navn?: ");
        //sets users input to String navn
        String navn = input.next();
        //souts "Hej" + user input
        System.out.println("Hej " + navn);


    }
}

package LayersSelektions_03;

import java.util.Scanner;

public class UserInterface {
    public static void runInterface() {
        System.out.print("Input two values, first and second: ");
        Scanner input = new Scanner(System.in);

        int first = input.nextInt();
        int second = input.nextInt();


        String resultat = Function.sammenLign(first, second);
        System.out.println(resultat);



    }
}
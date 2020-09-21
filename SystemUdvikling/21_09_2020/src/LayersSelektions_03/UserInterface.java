package LayersSelektions_03;

import java.util.Scanner;

public class UserInterface {
    //method
    public static void runInterface() {
        System.out.print("Input two values, first and second: ");
        Scanner input = new Scanner(System.in);
        //prompts user for input 3 values
        int first = input.nextInt();
        int second = input.nextInt();

        //runs sammenLign method, from Function class,
        //with the 2 values given.
        //Return Strings and sets to String "resultat".
        String resultat = Function.sammenLign(first, second);
        System.out.println(resultat);


    }
}
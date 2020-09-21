package LayerSelektions_04;

import java.util.Scanner;

public class UserInterface {
    //method
    public static void interfaceRun() {
        Scanner input = new Scanner(System.in);
        //prompts user for input 3 values
        System.out.print("Input a first, second and third value: ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();

        //runs valueCheck method, from Function class,
        //with the 3 values given.
        //Return Strings and sets to String "resultat".
        String resultat = Function.valueCheck(first, second, third);
        //souts String "resultat"
        System.out.println(resultat);

    }
}

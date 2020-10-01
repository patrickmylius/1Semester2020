package LayerSelektions_07;

import java.util.Scanner;

public class UserInterface {
    public static void promptUser() {
        Scanner input = new Scanner(System.in);
        //prompts user for input 2 values, x and y
        System.out.print("Input X and Y: ");
        int x = input.nextInt();
        int y = input.nextInt();

        //runs compute method, from Function class,
        //with the X and Y given.
        //Returns and sets to String "resultat".
        String resultat = Function.compute(x, y);
        System.out.println(resultat);
    }
}

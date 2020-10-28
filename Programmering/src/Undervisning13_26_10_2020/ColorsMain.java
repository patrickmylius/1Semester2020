/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 27-10-2020
 */
package Undervisning13_26_10_2020;


import java.util.Random;

public class ColorsMain {
    //Declaring constants
    static final int X = 5;
    static final int Y = 4;
    //Declaring random
    static Random rand = new Random();

    //Run
    public static void main(String[] args) {
        //Declaring arr randColors bound by y.
        int[] randColors = new int[Y];

        //Fori loop, executes until i is 10
        for (int i = 0; i < Y; i++) {
            int newColor;
            //Declare array colors and sets colors
            String[] colors = new String[X];
            colors[0] = "Blue";
            colors[1] = "Red";
            colors[2] = "Green";
            colors[3] = "White";
            colors[4] = "Yellow";

            //Do-while loop
            //executres randomColor and colorExists method
            do {
                newColor = randomColor(colors);
                if (colorExists(newColor, randColors))
                    System.out.println("Color exists, generates new.\n" + colors[newColor]);
            } while (colorExists(newColor, randColors));
            randColors[i] = newColor;
            System.out.println("Array index " + i + " indeholder farve " + colors[newColor]);

        }

    }
    //Method returning random color
    public static int randomColor(String[] array) {
        int theColor = rand.nextInt(array.length);
        return theColor;
    }
    //Method returns if color exists or not.
    public static boolean colorExists(int color, int[] array) {
        boolean exists = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == color)
                exists = true;
        }
        return exists;
    }
}

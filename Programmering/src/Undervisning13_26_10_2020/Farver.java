/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 27-10-2020
 */
package Undervisning13_26_10_2020;


import java.util.Random;

public class Farver {
    static final int x = 5;
    static final int y = 10;
    static Random rand = new Random();


    public static void main(String[] args) {
        int[] randColors = new int[y];


        for (int i = 0; i < y; i++) {
            int newColor;

            String[] colors = new String[x];
            colors[0] = "Blue";
            colors[1] = "Red";
            colors[2] = "Green";
            colors[3] = "White";
            colors[4] = "Yellow";

            do {
                newColor = randomColor(colors);
                if (colorExists(newColor, randColors))
                    System.out.println("Color exists, generates new.\n" + colors[newColor]);
            } while (colorExists(newColor, randColors));
            randColors[i] = newColor;
            System.out.println("Array index " + i + " indeholder farve " + randColors[i]);

        }

    }

    public static int randomColor(String[] array) {
        int theColor = rand.nextInt(array.length);
        return theColor;
    }

    public static boolean colorExists(int color, int[] array) {
        boolean exists = false;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == color)
                exists = true;
        }
        return exists;
    }
}

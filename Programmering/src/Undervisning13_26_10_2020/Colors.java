/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 28-10-2020
 */
package Undervisning13_26_10_2020;

public class Colors {
    public final String RED = "RED";
    public final String BLUE = "BLUE";
    public final String[] colors = {"Red", "Blue", "Green", "Yellow", "White"};


    public static void main(String[] args) {
        //Creates object color
        Colors color = new Colors();

        String theColor; //Declares theColor as string var
        String theColor2;
        String theColor3;

        theColor = color.BLUE; //Sets theColor to Blue, from String var "BLUE"
        theColor2 = color.colors[0]; //Sets theColor to first color in array "colors"
        theColor3 = ColorsEnum.BLACK.name(); //Sets theColor to a specific color from ColorsEnum class.

        //souts the color.
        System.out.println(theColor + " " + theColor2  + " "  +theColor3);
    }
}

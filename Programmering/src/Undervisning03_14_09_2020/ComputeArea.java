package Undervisning03_14_09_2020;
import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        //Declare radius
        double radius = 1.0;
        //Declare PI
        double PI = 3.14159;
        //Declare area
        double area = radius * radius * PI;
        //Prints area for cirlce with a radius of 1.0 to console
        System.out.println("The area is" + " " + area + " " + "for radius" + " " + radius);
        //sets radius to 2.0;
        radius = 2.0;
        //Finds new area
        double area2 = radius * radius * PI;
        //Prints area for cirlce with a radius of 2.0 to console
        System.out.println("The area is" + " " + area2 + "  " + "for radius" + " " + radius);

        //initizalize scanner, sets name to input
        Scanner input = new Scanner(System.in);
        System.out.print("You decide the radius now: ");
        //Takes input from console, sets it to new "radius"
        radius = input.nextDouble();
        //Finds new area
        double area3 = radius * radius * PI;
        //Prints area for circle with the given radius.
        System.out.println("The area is" + " " + area3 + " " + "for radius" + " " + radius);
    }
}

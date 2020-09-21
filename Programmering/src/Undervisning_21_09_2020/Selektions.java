package Undervisning_21_09_2020;

import java.awt.*;
import java.util.Collection;

public class Selektions {
    public static void main(String[] args) {
        int hour = 0;
        int minute = 58;

        // if
        if ((hour >= 9) && (hour < 15)) {
            System.out.println("Du er i skole");
            Eksempel.metode();
        } else
            System.out.println("Du er ikke i skole!");
        if (hour == 0) System.out.println("Det er midnat");
        if (minute < 60) System.out.println("Kloken er: " + hour + ":" + minute);

        //switch med String, Int kan bruges, så tjekker switch for ints.
        String color = "red";
        switch (color) {
            case "red":
                System.out.println("En rød sportsvogn");
                break;
            case "green":
                System.out.println("En grøn off-roader");
                break;
            default:
                System.out.println("En random bil");
        }
        //If statements, med samme behaviour som ovenstående Switch.
        if (color.equalsIgnoreCase("red")) {
            System.out.println("En rød sportsvogn");
        }
        else if (color.equalsIgnoreCase("green")) {
            System.out.println("En grøn off-roader");
        } else
            System.out.println("En random bil");

    }


}


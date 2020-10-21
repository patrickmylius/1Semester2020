/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 19-10-2020
 */
package Opgave_BilKomplet_19_10_2020;

import java.util.Scanner;

// user interface class takes user input
//returns temp to car
public class UserInterface {

    //UI Aircon metod, contains scanner and sets user input to variable.
    //returns input to Car
    static int uiAircon() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter todays temperature: ");
        int temperature = input.nextInt();

        return temperature;
    }

    //uiDestination metjod, contains scanner and sets input to variable
    //returns input to Car
    static String uiDestination() {
        Scanner input = new Scanner(System.in);

        System.out.println("GPS ON" + " " + "Greetings master, where are we going today... ");
        System.out.print("Zealand, Køge or to the Gym: ");

        String choiceOfDestination = input.next();
        return choiceOfDestination;
    }
}

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
    static int UIAircon() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter todays temperature: ");
        int temperature = input.nextInt();

        return temperature;
    }
}

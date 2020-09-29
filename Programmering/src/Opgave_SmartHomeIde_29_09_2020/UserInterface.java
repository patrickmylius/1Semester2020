/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 29-09-2020
 */
package Opgave_SmartHomeIde_29_09_2020;

import java.util.Scanner;

public class UserInterface {
    //Method holding all userinterface dialog
    //Prompts for input
    static void promptUser() {
        System.out.print("Insert the remote owners name: ");
        Scanner input = new Scanner(System.in);
        String remoteOwner = input.next();
        //Calls for findOwner method in Owners class and declares return to Object "owner"
        Remotes owner = Function.findOwner(remoteOwner);

        //sout results
        System.out.println("Owner of remote: " + owner.name);
        System.out.println("Distance to your remote: " + owner.distance);
        System.out.println("Battery left: " + owner.battery + "%");
    }
}

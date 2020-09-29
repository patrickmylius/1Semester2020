/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 29-09-2020
 */
package Opgave_SmartHomeIde_29_09_2020;

//Class extending Remote Variable class
public class Remotes extends RemoteVars {
    //Method
    void trackRemote() {
        System.out.println("BEEP BEEP BEEP");
    }
    //Method
    void blink() {
        System.out.println("Tracking light turned on");
    }
    //Sets declared variables in RemoteVars class, to this const.
    Remotes(String name, String distance, int power) {
        this.name = name;
        this.distance = distance;
        this.battery = power;
    }
}

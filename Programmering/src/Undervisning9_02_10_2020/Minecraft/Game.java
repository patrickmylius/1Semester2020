/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 02-10-2020
 */
package Undervisning9_02_10_2020.Minecraft;

public class Game {
    static void start() {
        System.out.println("Spillet er startet");

        Sheep martha = new Sheep();
        Dirt dirt1 = new Dirt();
        Dirt dirt2 = new Dirt();
        Dirt dirt3 = new Dirt();
        Dirt dirt4 = new Dirt();

        Wood wood1 = new Wood();
        Wood wood2 = new Wood();
        Wood wood3 = new Wood();
        Wood wood4 = new Wood();
    }
    static String ObjectAdded(String name) {
    return "One " + name + " added to the map";
    }
}

/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 02-10-2020
 */
package Undervisning9_02_10_2020.Minecraft;

public class Sheep {

    Head head;
    Body body;
    Feet foot1, foot2, foot3, foot4;

    public void roar() {
        System.out.println("Meeeheeheeheehee");
    }
    public void shit(){
        System.out.println("Plop plop");
    }

    public Sheep() {
        System.out.println(Game.ObjectAdded("Sheep"));
    }
}

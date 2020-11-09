/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-11-2020
 */
package Undervisning17_09_11_2020.Nedarvning_Polimorfi;


//Class vegetables extends behaviour from Groceries implementing Fridge interface
public class Vegetables extends Groceries implements Fridge {

    void freeze() {
        System.out.println("Frozen");
    }

    @Override
    public void fridge() {
        System.out.println("To avoid rotten vegetables, put them in fridge.");
    }

}

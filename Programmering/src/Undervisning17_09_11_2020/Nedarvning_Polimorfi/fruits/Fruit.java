/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-11-2020
 */
package Undervisning17_09_11_2020.Nedarvning_Polimorfi.fruits;

import Undervisning17_09_11_2020.Nedarvning_Polimorfi.main.Conserves;
import Undervisning17_09_11_2020.Nedarvning_Polimorfi.main.Groceries;

//Class fruit, extending behaviour from class Groceries, Implementing interface Conserves
public class Fruit extends Groceries implements Conserves {

    public void coolDown() {
        System.out.println("cooled down");
    }

    //Overriding interface conserv method
    @Override
    public void conserv() {
        System.out.println("Apple, is conserved this date.");
    }

}

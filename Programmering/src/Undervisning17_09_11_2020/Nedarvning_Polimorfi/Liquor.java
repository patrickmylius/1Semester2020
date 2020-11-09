/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-11-2020
 */
package Undervisning17_09_11_2020.Nedarvning_Polimorfi;

//Class Liquor, extending behaviour from class Groceries
public class Liquor extends Groceries {

    boolean idCheck;

    void oldEnough() {
        System.out.println("Cooling down");
    }
    void toYoung() {

            System.out.println("Bottle will self destruct in 10..");
            System.out.println("Bottle will self destruct in 7..");
            System.out.println("Bottle will self destruct in 3..");
            System.out.println("Bottle will self destruct in 1..");
            System.out.println("Klirk!");

    }
}

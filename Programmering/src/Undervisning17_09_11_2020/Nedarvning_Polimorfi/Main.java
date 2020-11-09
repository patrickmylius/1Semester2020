/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-11-2020
 */
package Undervisning17_09_11_2020.Nedarvning_Polimorfi;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.pricePrPiece = 2;
        a.bestBefore = new Date(1604832);
        a.smidUd();
        a.mature = true;
        a.coolDown();

        Peas p = new Peas();
        p.pricePrPiece = 4;
        p.bestBefore = new Date(1608768000);
        p.freeze();
    }
}

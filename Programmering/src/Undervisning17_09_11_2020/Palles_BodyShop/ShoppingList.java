/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-11-2020
 */
package Undervisning17_09_11_2020.Palles_BodyShop;

import java.util.Date;

public class ShoppingList {
    double pricePrPiece;
    Date bestBefore;
    boolean canSell = true;

    void smidUd() {
        canSell = false;
    }
}

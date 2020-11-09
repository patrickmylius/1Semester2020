/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-11-2020
 */
package Undervisning17_09_11_2020.Nedarvning_Polimorfi;

import java.util.Date;

public class Groseries {
    double pricePrPiece;
    Date bestBefore;
    boolean canSell = true;

    void smidUd() {
        canSell = false;
    }
}

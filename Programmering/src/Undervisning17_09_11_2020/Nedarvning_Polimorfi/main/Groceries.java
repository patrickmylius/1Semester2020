/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 09-11-2020
 */
package Undervisning17_09_11_2020.Nedarvning_Polimorfi.main;

import java.util.Date;

//Class Groceries, holds vars and function for all groceries
public class Groceries {

    public double pricePrPiece;
    public Date bestBefore;
    boolean canSell = true;

    public void smidUd() {
        canSell = false;
    }
}

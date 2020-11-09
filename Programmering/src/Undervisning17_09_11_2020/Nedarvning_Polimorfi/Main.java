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
    //Runs all groseries
    public static void main(String[] args) {

        //Create new apple
        Apple a = new Apple();
        a.pricePrPiece = 2;
        a.bestBefore = new Date(1604832);
        a.smidUd();
        a.mature = true;
        a.coolDown();

        //Create new banana
        Banana b = new Banana();
        b. pricePrPiece = 5;
        b.bestBefore = new Date(321312);
        b.smidUd();
        b.mature = true;
        b.coolDown();

        //Create new peas
        Peas p = new Peas();
        p.pricePrPiece = 4;
        p.bestBefore = new Date(1608768000);
        p.freeze();
        p.mature = true;

        //Create new Iceberg salad
        IcebergSalad ib = new IcebergSalad();
        ib.pricePrPiece = 15;
        ib.bestBefore = new Date(23213);
        ib.freeze();
        ib.mature = true;

        //Create new wine
        Wine w = new Wine();
        w.pricePrPiece = 75;
        w.bestBefore = new Date(1231534356);
        w.idCheck = true;
        w.oldEnough();

        //Create new Shots
        Shots s = new Shots();
        s.pricePrPiece = 150;
        s.bestBefore = new Date(21432432);
        s.idCheck = false;
        s.toYoung();

    }
}

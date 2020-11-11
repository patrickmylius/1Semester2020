/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 11-11-2020
 */
package Undervisning17_09_11_2020.Nedarvning_Polimorfi.main;


import Undervisning17_09_11_2020.Nedarvning_Polimorfi.fruits.Apple;
import Undervisning17_09_11_2020.Nedarvning_Polimorfi.fruits.Banana;
import Undervisning17_09_11_2020.Nedarvning_Polimorfi.liquor.Shots;
import Undervisning17_09_11_2020.Nedarvning_Polimorfi.liquor.Wine;
import Undervisning17_09_11_2020.Nedarvning_Polimorfi.vegetables.IcebergSalad;
import Undervisning17_09_11_2020.Nedarvning_Polimorfi.vegetables.Peas;

import java.util.ArrayList;

public class Stock {

    ArrayList<Groceries> stockHouse = new ArrayList<Groceries>();


    public void fillApple() {
        stockHouse.add(new Apple());
    }

    public void fillBanana() {
        stockHouse.add(new Banana());
    }

    public void fillIceberg() {
        stockHouse.add(new IcebergSalad());
    }

    public void fillPeas() {
        stockHouse.add(new Peas());
    }

    public void fillShots() {
        stockHouse.add(new Shots());
    }

    public void fillWine() {
        stockHouse.add(new Wine());
    }


    public int amountApples(Groceries groceries) {
        int amount = 0;
        for (Groceries apple : stockHouse) {
            if (apple.getClass() == groceries.getClass()) {
                amount++;
            }
        }
        return amount;
    }

    public int amountBanana(Groceries groceries) {
        int amount = 0;
        for (Groceries banana : stockHouse) {
            if (banana.getClass() == groceries.getClass()) {
                amount++;
            }
        }
        return amount;
    }

    public int amountIceberg(Groceries groceries) {
        int amount = 0;
        for (Groceries iceberg : stockHouse) {
            if (iceberg.getClass() == groceries.getClass()) {
                amount++;
            }
        }
        return amount;
    }

    public int amountPeas(Groceries groceries) {
        int amount = 0;
        for (Groceries peas : stockHouse) {
            if (peas.getClass() == groceries.getClass()) {
                amount++;
            }
        }
        return amount;
    }

    public int amountShots(Groceries groceries) {
        int amount = 0;
        for (Groceries shots : stockHouse) {
            if (shots.getClass() == groceries.getClass()) {
                amount++;
            }
        }
        return amount;
    }

    public int amountWine(Groceries groceries) {
        int amount = 0;
        for (Groceries wine : stockHouse) {
            if (wine.getClass() == groceries.getClass()) {
                amount++;
            }
        }
        return amount;
    }


    public int amountGroceries() {
        return stockHouse.size();
    }

    public void showGroceries() {

    }


    public int amountOf(String categori) {
        return 0;
    }
}

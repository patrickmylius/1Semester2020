/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 06-10-2020
 */
package Undervisning10_05_10_2020;

import java.util.ArrayList;

public class ArraList_Integer_W3School {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbs = new ArrayList<Integer>();
        myNumbs.add(10);
        myNumbs.add(15);
        myNumbs.add(20);
        myNumbs.add(25);
        myNumbs.add(30);
        for (int i : myNumbs) {
            System.out.println(i);
        }

    }
}


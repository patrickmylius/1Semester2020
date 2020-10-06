/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 06-10-2020
 */
package Undervisning10_05_10_2020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraList_Integer_W3School {
    public static void main(String[] args) {

        //Declares arrayList "myNumbs"
        //fills with numbs, 10,15,20,25 and 35
        //souts all numbs.
        ArrayList<Integer> myNumbs = new ArrayList<Integer>();
        myNumbs.add(15);
        myNumbs.add(10);
        myNumbs.add(25);
        myNumbs.add(20);
        myNumbs.add(35);
        //sorts numbs from lowest int to highest.
        Collections.sort(myNumbs);
        for (int i : myNumbs) {
            System.out.println(i);
        }


    }
}


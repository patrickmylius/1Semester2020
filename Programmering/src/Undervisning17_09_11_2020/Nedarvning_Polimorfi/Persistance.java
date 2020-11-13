/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 11-11-2020
 */
package Undervisning17_09_11_2020.Nedarvning_Polimorfi;

import Undervisning17_09_11_2020.Nedarvning_Polimorfi.main.DataFile;
import Undervisning17_09_11_2020.Nedarvning_Polimorfi.main.Groceries;
import Undervisning17_09_11_2020.Nedarvning_Polimorfi.main.Stock;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Persistance {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to Green Mall stocking system....");
        System.out.println("Loading data... ");

        DataFile datafile = new DataFile();
        datafile.save();
        datafile.load();
    }

    public void save() throws FileNotFoundException {
        //Create file instance
        java.io.File file = new java.io.File("data/groceries.txt");

        //Create new file
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        //write formatted out to file

        output.print("Beans: ");
        output.println(10);
        output.print("Apples: ");
        output.println(60);
        output.print("Wine: ");
        output.println(10);

        //Close file
        output.close();
    }

    public void load() {
        //Create a file instance
        java.io.File file = new java.io.File("data/groceries.txt");

        //Create a scanner for title

        Scanner input = new Scanner(System.in);

        //Read the data file
        while (input.hasNext()) {
            String groceries = input.next();
            int amount = input.nextInt();
            System.out.println(groceries + " " + amount);
        }

        //Closing file
        input.close();
    }

}

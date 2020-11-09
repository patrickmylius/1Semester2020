/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 30-09-2020
 */
package Undervisning08_30_09_2020;

public class ForLoop_W3School {
    public static void main(String[] args) {
        //executes for loop 5 times, exit when i is 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i);

        }
        //executes for loop 6 times,exit when i is 10
        //souts only even numbers
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        //sets weight to String array
        //souts Strings contained in array in order
        String[] weights = {"12KG", "16KG", "20KG", "24KG", "30KG", "36KG"};
        for (String i : weights){
            System.out.println(i);
        }

    }
}

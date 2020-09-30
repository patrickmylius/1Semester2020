/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 30-09-2020
 */
package Undervisning_30_09_2020;

public class WhileLoop_W3School {
    public static void main(String[] args) {
        //sets integer i to 0
        //execute while loop, 5 times, exit when i is 4
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        //sets i = 0
        //execute do while loop 5, exit when i is 4
        i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }

}
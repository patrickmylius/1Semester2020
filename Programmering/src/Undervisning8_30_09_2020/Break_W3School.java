/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 30-09-2020
 */
package Undervisning8_30_09_2020;

public class Break_W3School {
    public static void main(String[] args) {
        //executes for loop 4 times, then breaks
        //souts i
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;//exit
            }
            System.out.println(i);
        }
        //executes loop aslong as i is less than 10
        //executes if statement when i is 8
        //skips 8
        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                continue;//skips value of 8
            }
            System.out.println(i);
        }
        //sets i to 0
        //execute while loop aslong as i is less than 10
        //break; exits loop when i is 5
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break;
            }
        }
        //sets i to 0
        //executes while loop aslong as i is less than 20
        //executes if statement when i is 4
        //skips value 4
        i = 0;
        while (i < 20) {
            if (i == 4) {
                i++;
                continue;//skips value 4
            }
            System.out.println(i);
            i++;
        }


    }
}

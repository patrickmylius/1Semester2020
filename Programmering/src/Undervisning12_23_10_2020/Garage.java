/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 23-10-2020
 */
package Undervisning12_23_10_2020;

public class Garage {
    static String[] color = {"blue", "red", "green", "yellow", "black"};

    public static void main(String[] args) {

        Car[] cars = new Car[1000000]; //creates var array with 1mil slots.
        //fori loop creating 100000 blue cars.
        for (int i = 0; i < cars.length; i++) {
            //fills array with 1 mil cars of diff colors.
            cars[i] = new Car(randomColor()); //creates a new car for every i from 0-100000
            System.out.println("Bil: " + i + 1 + ". "); //sout arr numb + 1.
            System.out.println(cars[i].color);//Sout random generated car color.
        }
    }

    //Method returning randomly between colors from String[] "color"
    //Colors: blue, red, green, yellow and black.
    static String randomColor() {
        double x = Math.random() * 5;
        return color[(int) x];
    }
}

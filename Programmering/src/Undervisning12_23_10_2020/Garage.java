/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 23-10-2020
 */
package Undervisning12_23_10_2020;

public class Garage {
    static String[] color = {"Blue", "Red", "Green", "Yellow", "Black"};
    static String[] minion = {MinionDriver.BOB.name(), MinionDriver.KEVIN.name(), MinionDriver.DAVE.name(), MinionDriver.CARL.name(), MinionDriver.STUART.name()};
    static String[] model = {Model.AUDI.name(), Model.HYUNDAI.name(), Model.MERCEDES.name(), Model.PEUGOT.name(), Model.FERRARI.name()};

    public static void main(String[] args) {

        Car[] cars = new Car[1000000]; //creates var array with 1mil slots.
        //fori loop creating 100000 blue cars.
        for (int i = 0; i < cars.length; i++) {
            //fills array with 1 mil cars of diff colors.
            cars[i] = new Car(randomColor()); //creates a new car for every i from 0-100000
            System.out.println("Car: " + i + 1 + ". "); //sout arr numb + 1.
            System.out.println("Model: " + randomCarModel());
            System.out.println("Color: " + cars[i].color);//Sout random generated car color.
            System.out.println("Minion driver: " + randomMinionDriver());

        }
    }

    //Method returning randomly between colors from String[] "color"
    //Colors: blue, red, green, yellow and black.
    static String randomColor() {
        double x = Math.random() * 5;
        return color[(int) x];
    }
    //Method returning randomly between minions from String[] "minion" which inherits MinionDriver enum.
    //minion: BOB, KEVIN, DAVE, CARL and STUART.
    static String randomMinionDriver() {
        double x = Math.random() * 5;
        return minion[(int) x];
    }
    //Method returning randomly between models from String[] "model" which inherits Model enum.
    //minion: AUDI, HYINDAI, MERCEDES, PEUGOT, FERRARI.
    static String randomCarModel() {
        double x = Math.random() * 5;
        return model[(int) x];
    }
}

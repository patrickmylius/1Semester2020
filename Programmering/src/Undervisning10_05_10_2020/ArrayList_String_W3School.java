/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 06-10-2020
 */
package Undervisning10_05_10_2020;

import java.util.ArrayList;

public class ArrayList_String_W3School {
    public static void main(String[] args) {
        //Create object arraylist cars
        //add cars strings to object
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //gets array index 0
        cars.get(0);
        //sets array index 0 to contain "Opel"
        cars.set(0, "Opel");
        //removes array index 0
        cars.remove(0);
        //remove all cars strings
        cars.clear();
        //get cars array size
        cars.size();

        //Declare new object bikes
        //add bike strings
        //sout all strings in array
        ArrayList<String> bikes = new ArrayList<String>();
        bikes.add("Trek");
        bikes.add("Cube");
        bikes.add("Kid Bike");
        bikes.add("Mustang");
        for (int i = 0; i < bikes.size(); i++) {
            System.out.println(bikes.get(i));
        }

        for (String i : bikes) {
            System.out.println(i);
        }
    }
}

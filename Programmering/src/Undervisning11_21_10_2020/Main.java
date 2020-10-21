/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 21-10-2020
 */
package Undervisning11_21_10_2020;
// Der i programmering ofte er brug for datastrukturer,
// som kan indeholde en masse ens værdier eller objekter.
// Disse beholdere kaldes arrays, ArrayLists eller LinkedLists.

// For eksempel vil en skoleklasse indeholde en masse studerende-objekter,
// en garage vil indeholde en masse bil-objekter, eller en smarthome vil indeholde en masse smart-devices.
// Syntaksen for at lave en array med 5 studerende er følgende:
public class Main {
    public static void main(String[] args) {
        //Declares array
        //Holds Studerende objects
        Studerende[] klassen = new Studerende[6];
        klassen[0] = new Studerende("Anders", 22, "Male");
        klassen[1] = new Studerende("Ursula", 19, "Female");
        klassen[2] = new Studerende("Mads", 35, "Male");
        klassen[3] = new Studerende("Lisbeth", 50, "Female");
        klassen[4] = new Studerende("Simon", 24, "Male");
        klassen[5] = new Studerende("Matilde", 23, "SexyFemale");

        //souts array length
        System.out.println("Student in class: " + klassen.length);
        System.out.println("____________________________________________");

        //Souts studerende
        System.out.println(klassen[0].name + ", " + klassen[0].age + ", " + klassen[0].gender);
        System.out.println(klassen[1].name + ", " + klassen[1].age + ", " + klassen[1].gender);
        System.out.println(klassen[2].name + ", " + klassen[2].age + ", " + klassen[2].gender);
        System.out.println(klassen[3].name + ", " + klassen[3].age + ", " + klassen[3].gender);
        System.out.println(klassen[4].name + ", " + klassen[4].age + ", " + klassen[4].gender);
        System.out.println(klassen[5].name + ", " + klassen[5].age + ", " + klassen[5].gender);

    }
}

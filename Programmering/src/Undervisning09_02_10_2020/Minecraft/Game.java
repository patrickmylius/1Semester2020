/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 02-10-2020
 */
package Undervisning09_02_10_2020.Minecraft;


public class Game {
    static void start() {
        System.out.println("Spillet er startet");

        Sheep martha = new Sheep();

        Dirt dirt1 = new Dirt();
        Dirt dirt2 = new Dirt();

        Wood wood1 = new Wood();
        Wood wood2 = new Wood();
        //Group copy paste in Minecraft.
        Player player1 = new Player("Usamah", 1, 100, 100, "Female", "Crypt", 1);
        Player player2 = new Player("Daniella", 2, 110, 105, "Female", "Indoor", 1000);
        Player player3 = new Player("Patrick", 3, 120, 115, "Male", "Crypt", 50);
        Player player4 = new Player("Danijel", 4, 130, 125, "Male", "Indoor", 40);
        Player player5 = new Player("Mikkel", 5, 140, 135, "Male", "Indoor", 15);

        player1.sleep();
        player2.run();
        player3.sit();
        player4.introduce();
        player5.attack();



    }

    static String ObjectAdded(String name) {
        return "One " + name + " added to the map";
    }

    static String Stats(String name, int level, int hp, int mana, String gender, String location, int creaturesKilled) {
        return "Name: " + name + "" +
                "\nLevel: " + level + "" +
                "\nHP: " + hp + "" +
                "\nMANA: " + mana + "" +
                "\nGender: " + gender + "" +
                "\nLocation: " + location + "" +
                "\nMOBS: " + creaturesKilled + "\n";
    }
}


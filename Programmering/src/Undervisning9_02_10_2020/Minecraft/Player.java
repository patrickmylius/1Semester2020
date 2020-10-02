/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 02-10-2020
 */
package Undervisning9_02_10_2020.Minecraft;

//Player class extending Stats
public class Player extends Stats {
    //Player has 1 head, 1 body, 2 hands and 2 feets.
    Head head;
    Body body;
    Hand hand1, hand2;
    Feet foot1, foot2;
    Stats stats;

    void introduce(){
        System.out.println("Hi there, my name is: " + name);
    }

    void run() {
        System.out.println(name + " " + "runs");
    }

    void attack() {
        System.out.println(name + " " + "attacks!");
    }

    void sit() {
        System.out.println(name + " " + "sits down");
    }
    void sleep(){
        System.out.println(name + " " + "went to sleep");
    }

    //Player constructer. set stats, to object player.
    Player(String name, int level, int hp, int mana, String gender, String location, int creaturesKilled) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.mana = mana;
        this.gender = gender;
        this.location = location;
        this.creaturesKilled = creaturesKilled;

        //Calls Game class, executing ObjectAdded method sout player name.
        System.out.println(Game.ObjectAdded("Player"));
        //Calls game class, executes playerStats souts player stats.
        System.out.println(Game.Stats(name, level, hp, mana, gender, location, creaturesKilled));

    }
}
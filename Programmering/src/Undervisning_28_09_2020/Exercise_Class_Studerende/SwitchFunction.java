/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 28-09-2020
 */
package Undervisning_28_09_2020.Exercise_Class_Studerende;
//
public class SwitchFunction {

    static void findUser(String membName){

        GroupMember patrick = new GroupMember();
        patrick.name = "Patrick";
        patrick.age = 26;
        patrick.studieRetning = "Datamatik";
        patrick.favoritTopic = "Muscle training";
        patrick.favoritFood = "Lasagne";

        GroupMember usamah = new GroupMember();
        usamah.name = "Usamah";
        usamah.age = 25;
        usamah.favoritTopic = "Humanbeings behaviour";
        usamah.favoritFood = "Noobs in league of legends";

        GroupMember daniella = new GroupMember();
        daniella.name = "Daniella";
        daniella.age = 23;
        daniella.favoritTopic = "Jehova";
        daniella.favoritFood = "Pizza";

        GroupMember mikkel = new GroupMember();
        mikkel.name = "Mikkel";
        mikkel.age = 22;
        mikkel.favoritTopic = "Gaming";
        mikkel.favoritFood = "Italian dishes";

        GroupMember danijel = new GroupMember();
        danijel.name = "Danijel";
        danijel.age = 22;
        danijel.favoritTopic = "Coding";
        danijel.favoritFood = "Burger";

        switch (membName.toLowerCase()) {
            case "patrick":
                patrick.introduce();
                System.out.println("My name is " + patrick.name);
                System.out.println("I am " + patrick.age + " years old");
                System.out.println(patrick.studieRetning);
                break;
            case "usamah":
                usamah.introduce();
                System.out.println("My name is " + usamah.name);
                System.out.println("I am " + usamah.age + " years old");
                System.out.println(usamah.studieRetning);
                break;
            case "daniella":
                daniella.introduce();
                System.out.println("My name is " + daniella.name);
                System.out.println("I am " + daniella.age + " years old");
                System.out.println(daniella.studieRetning);
                break;
            case "mikkel":
                mikkel.introduce();
                System.out.println("My name is " + mikkel.name);
                System.out.println("I am " + mikkel.age + " years old");
                System.out.println(mikkel.studieRetning);
                break;
            case "danijel":
                danijel.introduce();
                System.out.println("My name is " + danijel.name);
                System.out.println("I am " + danijel.age + " years old");
                System.out.println(danijel.studieRetning);
                break;
            default:
                System.out.println("Sorry, no group member of Copy paste, matching your input");

        }
    }
}

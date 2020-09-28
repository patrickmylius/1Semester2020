/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 28-09-2020
 */
package Undervisning_28_09_2020.Exercise_Class_Studerende;

//
public class ObjectsAndSwitch {
    //findUser method, takes String membName from UserInterface class
    static GroupMember findUser(String membName) {
        //new Object
        GroupMember patrick = new GroupMember();
        patrick.name = "Patrick";
        patrick.age = 26;
        patrick.studieRetning = "Datamatik";
        patrick.favoritTopic = "Muscle training";
        patrick.favoritFood = "Lasagne";
        //new Object
        GroupMember usamah = new GroupMember();
        usamah.name = "Usamah";
        usamah.age = 25;
        usamah.favoritTopic = "Humanbeings behaviour";
        usamah.favoritFood = "Noobs in league of legends";
        //new Object
        GroupMember daniella = new GroupMember();
        daniella.name = "Daniella";
        daniella.age = 23;
        daniella.favoritTopic = "Jehova";
        daniella.favoritFood = "Pizza";
        //new Object
        GroupMember mikkel = new GroupMember();
        mikkel.name = "Mikkel";
        mikkel.age = 22;
        mikkel.favoritTopic = "Gaming";
        mikkel.favoritFood = "Italian dishes";
        //new Object
        GroupMember danijel = new GroupMember();
        danijel.name = "Danijel";
        danijel.age = 22;
        danijel.favoritTopic = "Coding";
        danijel.favoritFood = "Burger";

        GroupMember memberFound;
        //Switch, running membName through statements.
        switch (membName.toLowerCase()) {
            case "patrick":
                patrick.introduce();
                memberFound = patrick;
                break;
            case "usamah":
                usamah.introduce();
                memberFound = usamah;
                break;
            case "daniella":
                daniella.introduce();
                memberFound = daniella;
                break;
            case "mikkel":
                mikkel.introduce();
                memberFound = mikkel;
                break;
            case "danijel":
                danijel.introduce();
                memberFound = danijel;
                break;

            default:
                return new GroupMember();

        }
        return memberFound;
    }
}

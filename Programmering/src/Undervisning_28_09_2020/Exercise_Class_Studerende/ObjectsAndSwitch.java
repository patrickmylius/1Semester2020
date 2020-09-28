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
        GroupMember patrick = new GroupMember("Patrick", 26, "Muscle training", "Lasagne");
        //new Object
        GroupMember usamah = new GroupMember("Usamah", 24, "Humanbeings behaviour", "Noobs in league of legends");
        //new Object
        GroupMember daniella = new GroupMember("Daniella", 23, "Jehova", "Pizza");
        //new Object
        GroupMember mikkel = new GroupMember("Mikkel", 22, "Gaming", "Italian dishes");
        //new Object
        GroupMember danijel = new GroupMember("Danijel", 22, "Coding", "Burger");

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
                return new GroupMember("0", 0, "0", "0");

        }
        return memberFound;
    }
}

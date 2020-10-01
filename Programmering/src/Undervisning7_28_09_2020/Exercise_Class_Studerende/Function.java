/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 28-09-2020
 */
package Undervisning7_28_09_2020.Exercise_Class_Studerende;

//
public class Function {
    //findUser method, takes String membName from UserInterface class
    static GroupMember findUser(String membName) {
        //new Object
        GroupMember person1 = new GroupMember("Patrick", 26, "Muscle training", "Lasagne");
        //new Object
        GroupMember person2 = new GroupMember("Usamah", 24, "Humanbeings behaviour", "Noobs in league of legends");
        //new Object
        GroupMember person3 = new GroupMember("Daniella", 23, "Jehova", "Pizza");
        //new Object
        GroupMember person4 = new GroupMember("Mikkel", 22, "Gaming", "Italian dishes");
        //new Object
        GroupMember person5 = new GroupMember("Danijel", 22, "Coding", "Burger");

        GroupMember memberFound;
        //Switch, running membName through statements.
        switch (membName.toLowerCase()) {
            case "patrick":
                person1.introduce();
                memberFound = person1;
                break;
            case "usamah":
                person2.introduce();
                memberFound = person2;
                break;
            case "daniella":
                person3.introduce();
                memberFound = person3;
                break;
            case "mikkel":
                person4.introduce();
                memberFound = person4;
                break;
            case "danijel":
                person5.introduce();
                memberFound = person5;
                break;

            default:
                return new GroupMember("0", 0, "0", "0");

        }
        return memberFound;
    }
}

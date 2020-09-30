/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 30-09-2020
 */
package Undervisning_30_09_2020.Hus;

//Class MyHouse containing Obj mainDoor, backDoor and basementDoor
//Specified for a house, with these 3 doors.
class MyHouse extends Door {
    //Declaring the 3 doors in the house, main, back and basement.
    static Door mainDoor = new Door();
    static Door backDoor = new Door();
    static Door basementDoor = new Door();

    //Method unlocks all doors and opens main door
    static void home() {
        mainDoor.openLock();
        mainDoor.Open();
        backDoor.openLock();
        basementDoor.openLock();

    }

    //Method closes main door and lock all doors
    static void lockHouse() {
        mainDoor.close();
        mainDoor.locked();
        backDoor.close();
        backDoor.locked();
        basementDoor.close();
        basementDoor.locked();
    }
}

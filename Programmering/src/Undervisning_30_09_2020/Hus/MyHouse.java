/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 30-09-2020
 */
package Undervisning_30_09_2020.Hus;

//Class MyHouse extending door containing Obj mainDoor, backDoor and basementDoor from Door class
//Simulates a house with 3 entrys, maindoor, backdoor and basementdoor
//using doors from door class
class MyHouse extends Door {

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

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
    //Sets adress, houseLocked and houseUnlocked to strings
    static String adress = "Astersvej 33 ";
    static String houseLocked = "HOUSE LOCKED:\nMain door closed\nMain door locked\nBackdoor closed\nBackDoor locked\nBasement door closed\nBasement door locked";
    static String houseUnlocked = "HOUSE UNLOCKED:\nMain door unlocked\nMain door open\nBackdoor unlocked\nBasement door unlocked";

    //Method unlocks all doors and opens main door
    static void unlockHome() {
        mainDoor.openLock();
        mainDoor.Open();
        backDoor.openLock();
        basementDoor.openLock();
    }

    //Method closes main door and lock all doors
    static void lockHome() {
        mainDoor.close();
        mainDoor.locked();
        backDoor.close();
        backDoor.locked();
        basementDoor.close();
        basementDoor.locked();
    }
    //Method returning adress and houseLocked
    static String promptUserLock() {
        return adress + houseLocked;
    }
    //Method returning adress and houseUnlocked
    static String promptUserUnlock() {
        return adress + houseUnlocked;
    }
}

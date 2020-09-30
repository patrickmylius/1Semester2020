package Undervisning_30_09_2020.Hus;

public class Function {
    static String houseStatus(String answer) {
        String houseLocked = "HOUSE LOCKED:\nMain door is unlocked\nMain door is open\nBackdoor is unlocked\nBasement door is unlocked";
        String houseUnlocked = "HOUSE UNLOCKED:\nMain door is locked\nMain door is closed\nBackdoor is locked\nBasement door is locked";
        if (answer.equalsIgnoreCase("yes")) {
            home();
            return houseLocked;
        } else
            lockHouse();
        return houseUnlocked;

    }

    static void home() {
        Door mainDoor = new Door();
        Door backDoor = new Door();
        Door basementDoor = new Door();
        mainDoor.openLock();
        mainDoor.Open();
        backDoor.openLock();
        basementDoor.openLock();

    }

    static void lockHouse() {
        Door mainDoor = new Door();
        Door backDoor = new Door();
        Door basementDoor = new Door();
        mainDoor.close();
        mainDoor.locked();
        backDoor.close();
        backDoor.locked();
        basementDoor.close();
        basementDoor.locked();
    }

}

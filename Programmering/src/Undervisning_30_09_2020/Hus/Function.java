package Undervisning_30_09_2020.Hus;

public class Function {
    //method house status, returns String
    static String houseStatus(String answer) {
        String houseLocked = "HOUSE UNLOCKED:\nMain door is unlocked\nMain door is open\nBackdoor is unlocked\nBasement door is unlocked";
        String houseUnlocked = "HOUSE LOCKED:\nMain door is closed\nMain door is locked\nBackdoor is locked\nBasement door is locked";

        //When user input equals "yes", run home method and return houseUnlocked
        //Any other user input, runs lockHouse method return houseLocked
        if (answer.equalsIgnoreCase("yes")) {
            MyHouse.home();
            return houseLocked;
        } else
            MyHouse.lockHouse();
        return houseUnlocked;

    }

}

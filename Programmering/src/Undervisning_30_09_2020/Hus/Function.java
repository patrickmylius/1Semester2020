package Undervisning_30_09_2020.Hus;

public class Function {
    //method house status, returns String
    static String houseStatus(String password, String answer) {
        //if, else if statement, deciding houseStatus string return based on user inputs
        if (password.equalsIgnoreCase("1") && answer.equalsIgnoreCase("yes")) {
            BigHouse.unlockHome();
            return BigHouse.promptUserUnlock();

        } else if (password.equalsIgnoreCase("1") && answer.equalsIgnoreCase("no")) {
            BigHouse.lockHome();
            return BigHouse.promptUserLock();

        } else if (password.equalsIgnoreCase("2") && answer.equalsIgnoreCase("yes")) {
            MyHouse.unlockHome();
            return MyHouse.promptUserUnlock();

        } else if (password.equalsIgnoreCase("2") && answer.equalsIgnoreCase("no")) {
            MyHouse.lockHome();
            return MyHouse.promptUserLock();
        } else return null;


    }
}


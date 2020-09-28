package Undervisning_28_09_2020.Exercise_Class_Studerende;

import java.util.Scanner;

public class UserInterface {
    static void promptUser() {
        System.out.print("Insert group member of copy paste name: ");

        Scanner input = new Scanner(System.in);
        String membName = input.next();

        SwitchFunction.findUser(membName);
    }
}

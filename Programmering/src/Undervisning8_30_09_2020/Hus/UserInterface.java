package Undervisning8_30_09_2020.Hus;

import java.util.Scanner;

public class UserInterface {
    //promptUser method, prompts user for input
    static void promptUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Password(input 1 or 2): ");
        String password = input.next();
        System.out.print("Are you home: ");
        String answer = input.next();
        //Class function class and runs houseStatus method with inputs
        //sets it to houseStatus and souts
        String houseStatus = Function.houseStatus(password, answer);
        //Souts locking status of house
        System.out.println(houseStatus);
    }
}
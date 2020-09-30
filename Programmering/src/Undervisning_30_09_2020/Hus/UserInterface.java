package Undervisning_30_09_2020.Hus;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class UserInterface {
    //promptUser method, prompts user for input
    static void promptUser() {
        System.out.print("Are you home: ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        //Class function class and runs houseStatus method with input
        //sets it to houseStatus and souts
        String houseStatus = Function.houseStatus(answer);
        System.out.println(houseStatus);
    }
}
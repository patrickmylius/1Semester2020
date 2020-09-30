package Undervisning_30_09_2020.Hus;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class UserInterface {
    static void promptUser() {


        System.out.println("Are you home: ");
        Scanner input = new Scanner(System.in);
        String answer = input.next();

        String houseStatus = Function.houseStatus(answer);
        System.out.println(houseStatus);
    }
}
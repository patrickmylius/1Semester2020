package Undervisning_28_09_2020.Exercise_Class_Studerende;

import Undervisning_28_09_2020.Exercise_Statements_MuscleProgram.Function;

import java.util.Scanner;

public class UserInterface {
    static String promptUser() {
        System.out.print("Insert group member of copy paste name: ");

        Scanner input = new Scanner(System.in);
        String membName = input.next();

        return membName;
    }
}

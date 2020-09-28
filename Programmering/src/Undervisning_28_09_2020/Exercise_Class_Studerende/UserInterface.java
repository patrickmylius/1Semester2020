package Undervisning_28_09_2020.Exercise_Class_Studerende;

import java.util.Scanner;

public class UserInterface {
    static void promptUser() {
        //Prompts user to input a string
        System.out.print("Insert group member of copy paste name: ");
        Scanner input = new Scanner(System.in);
        String membName = input.next();
        //runs findUser method, takes string membName(input). Return declared to GroupMember "student"
        GroupMember student = ObjectsAndSwitch.findUser(membName);

        //sout returned objects and strings
        System.out.println("My name is " + student.name);
        System.out.println("I am " + student.age + " years old");
        System.out.println(student.studieRetning);
    }
}

package Undervisning_28_09_2020.Exercise_Statements_MuscleProgram;

import java.util.Scanner;

//Class containing scanner and souts
public class UserInterface {
    //Method that prompt for user input
    public static void promptInput() {
        System.out.println("Please input which muscle group");
        System.out.print("Chest, biceps, triceps, back, legs, shoulders, abs: ");

        Scanner input = new Scanner(System.in);
        String muscle = input.next();
        //Calls Function class and runs switchMuscle method then sets result of switch case to = exercise
        String exercise = Function.switchMuscle(muscle);

        //if statement, with string equals muscle input condition
        //true runs motivation method
        //false calls tryAgain method
        if (muscle.equalsIgnoreCase("chest")
                || muscle.equalsIgnoreCase("triceps")
                || muscle.equalsIgnoreCase("biceps")
                || muscle.equalsIgnoreCase("back")
                || muscle.equalsIgnoreCase("legs")
                || muscle.equalsIgnoreCase("shoulders")
                || muscle.equalsIgnoreCase("abs")) {
            //souts exercise + strings
            String out = " exercises";
            String textSpace = "\n \n";
            System.out.println(exercise + out + textSpace);
            //calls function class running motivation method
            Function.motivation();
        } else {
            //calls function class running tryAgain method
            Function.tryAgain();
        }
    }

}

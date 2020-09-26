package Undervisning_28_09_2020.Exercise;
import java.util.Scanner;
//Class containing scanner and souts
public class UserInterface {
    //Method that prompt for user input
    public static void promptInput() {
        System.out.println("Please input which muscle group");
        System.out.print("Chest, biceps, Triceps, back, legs or shoulders: ");

        Scanner input = new Scanner(System.in);
        String muscle = input.next();
        //Calls Function class and runs switchMuscle method then sets result of switch case to = exercise
        String exercise = Function.switchMuscle(muscle);
        //souts exercise
        //containing souts with multiple exercises matching users input
        System.out.println(exercise);
    }

}

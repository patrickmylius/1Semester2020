/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 29-09-2020
 */
package Undervisning_28_09_2020.Exercise_Statements_MuscleProgram;

public class Test {
    public static void main(String[] args) {
        //Declaring switch case variables.
        String outChest = "chest";
        String outBiceps = "biceps";
        String outTriceps = "triceps";
        String outBack = "back";
        String outLegs = "legs";
        String outShoulders = "shoulders";
        String outAbs = "abs";
        String outWrongInput = "volapyk";


        //Testcase: 1
        //Input: "chest"
        //Expected output: "\nBenchpress, Flyes, Cable press"
        String resultChest = Function.switchMuscle("chest");
        compareStrings(resultChest, outChest);
        //Actual output: "chest"
        //Test result: PASS

        //Testcase: 2
        //Input: "biceps"
        //Expected output: "biceps"
        String resultBiceps = Function.switchMuscle("biceps");
        compareStrings(resultBiceps, outBiceps);
        //Actual output: "biceps"
        //Test result: PASS

        //Testcase: 3
        //Input: "triceps"
        //Expected output: "triceps"
        String resultTriceps = Function.switchMuscle("triceps");
        compareStrings(resultTriceps, outTriceps);
        //Actual output: "triceps"
        //Test result: PASS

        //Testcase: 4
        //Input: "back"
        //Expected output: "back"
        String resultBack = Function.switchMuscle("back");
        compareStrings(resultBack, outBack);
        //Actual output: "back"
        //Test result: PASS

        //Testcase: 5
        //Input: "legs"
        //Expected output: "\nBenchpress, Flyes, Cable press"
        String resultLegs = Function.switchMuscle("legs");
        compareStrings(resultLegs, outLegs);
        //Actual output: "legs"
        //Test result: PASS

        //Testcase: 6
        //Input: "shoulders"
        //Expected output: "shoulders"
        String resultShoulders = Function.switchMuscle("shoulders");
        compareStrings(resultShoulders, outShoulders);
        //Actual output: "shoulders"
        //Test result: PASS

        //Testcase: 7
        //Input: "abs"
        //Expected output: "abs"
        String resultAbs = Function.switchMuscle("abs");
        compareStrings(resultAbs, outAbs);
        //Actual output: "abs"
        //Test result: PASS

        //Testcase: 8
        //Input "volapyk"
        //Espected output: "volapyk"
        String resultTryAgain = Function.switchMuscle("volapyk");
        compareStrings(resultTryAgain, outWrongInput);
        //Actual output: "volapyk"
        //Test result: PASS

        //TODO : TEST If return statement, with motivation() and Function.
    }
    //Test return method, comparing actual return, with our expectedResult
    static void compareStrings(String result, String expectedResult){
        if (result.equals(expectedResult)) {
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }
}

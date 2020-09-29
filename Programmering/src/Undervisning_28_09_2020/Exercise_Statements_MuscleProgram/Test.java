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


        //Testcase:
        //Input: "chest"
        //Expected output: "\nBenchpress, Flyes, Cable press"
        String resultChest = Function.switchMuscle("chest");
        compareStrings(resultChest, outChest);
        //Actual output: "chest"
        //Test result: PPASS

        //Testcase:
        //Input: "biceps"
        //Expected output: "biceps"
        String resultBiceps = Function.switchMuscle("biceps");
        compareStrings(resultBiceps, outBiceps);
        //Actual output: "biceps"
        //Test result: PASS

        //Testcase:
        //Input: "triceps"
        //Expected output: "triceps"
        String resultTriceps = Function.switchMuscle("triceps");
        compareStrings(resultTriceps, outTriceps);
        //Actual output: "triceps"
        //Test result: PASS

        //Testcase:
        //Input: "back"
        //Expected output: "back"
        String resultBack = Function.switchMuscle("back");
        compareStrings(resultBack, outBack);
        //Actual output: "back"
        //Test result: PASS

        //Testcase:
        //Input: "legs"
        //Expected output: "\nBenchpress, Flyes, Cable press"
        String resultLegs = Function.switchMuscle("legs");
        compareStrings(resultLegs, outLegs);
        //Actual output: "legs"
        //Test result: PASS

        //Testcase:
        //Input: "shoulders"
        //Expected output: "shoulders"
        String resultShoulders = Function.switchMuscle("shoulders");
        compareStrings(resultShoulders, outShoulders);
        //Actual output: "shoulders"
        //Test result: PASS

        //Testcase:
        //Input: "abs"
        //Expected output: "abs"
        String resultAbs = Function.switchMuscle("abs");
        compareStrings(resultAbs, outAbs);
        //Actual output: "abs"
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

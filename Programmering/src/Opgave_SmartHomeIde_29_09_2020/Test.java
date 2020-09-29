/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 29-09-2020
 */
package Opgave_SmartHomeIde_29_09_2020;

//Test class for SmartHomeIde Assignment
public class Test {
    public static void main(String[] args) {
        //Currently hit a wall, due to the reason
        //That i can find my way, of what to catch on the object return.
        //Which makes it impossible for me, to match actual result with expected result.
        Remotes outOwner1 = new Remotes("Patrick", "10 feet", 50);
        Remotes outOwner2 = new Remotes("Usamah", "30 feet", 25);
        Remotes outOwner3 = new Remotes("Daniella", "40 feet", 69);
        Remotes outOwner4 = new Remotes("Danijel", "20 feet", 99);
        Remotes outOwner5 = new Remotes("Mikkel", "5 feet", 41);


        //Testcase
        //Testinput: "patrick"
        //Forventet output: new Remotes("Patrick", "10 feet", 50)
        Remotes result1 = FunctionFindOwner.findOwner("patrick");
        testResult(result1, outOwner1);
        //Faktisk output: new Remotes("Patrick", "10 feet", 50)
        //Testresultat: PASS

        //Testcase:
        //Testinput: "usamah"
        //Forventet output: new Remotes("Usamah", "30 feet", 25)
        Remotes result2 = FunctionFindOwner.findOwner("usamah");
        testResult(result2, outOwner2);
        //Faktisk output: new Remotes("Usamah", "30 feet", 25)
        //Testresultat: PASS

        //Testcase:
        //Testinput: "daniella"
        //Forventet output: new Remotes("Daniella", "40 feet", 69)
        Remotes result3 = FunctionFindOwner.findOwner("daniella");
        testResult(result3, outOwner3);
        //Faktisk output: new Remotes("Daniella", "40 feet", 69)
        //Testresultat: PASS

        //Testcase:
        //Testinput: "danijel"
        //Forventet output: new Remotes("Danijel", "20 feet", 99)
        Remotes result4 = FunctionFindOwner.findOwner("danijel");
        testResult(result4, outOwner4);
        //Faktisk output: new Remotes("Danijel", "20 feet", 99)
        //Testresultat: PASS

        //Testcase:
        //Testinput: "daniella"
        //Forventet output: new Remotes("Mikkel", "5 feet", 41)
        Remotes result5 = FunctionFindOwner.findOwner("mikkel");
        testResult(result5, outOwner5);
        //Faktisk output: new Remotes("Mikkel", "5 feet", 41)
        //Testresultat: PASS


    }

    //Method, that holds the methods below, to get a cleaner syntax.
    static void testResult(Remotes result, Remotes expectedResult) {
        compareStrings(result.name, expectedResult.name);
        compareStrings(result.distance, expectedResult.distance);
        compareInts(result.battery, expectedResult.battery);
    }

    //Test returns, comparing String result and String expectedResult (name and distance)
    static void compareStrings(String result, String expectedResult) {
        if (result.equals(expectedResult)) {
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }

    //Test returns, comparing int result and int expectedResult(Battery)
    static void compareInts(int result, int expectedResult) {
        if (result == (expectedResult)) {
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }
}

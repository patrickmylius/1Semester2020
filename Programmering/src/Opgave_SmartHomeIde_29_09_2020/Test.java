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
        compareStrings(result1.name, outOwner1.name);
        compareStrings(result1.distance, outOwner1.distance);
        compareInts(result1.battery, outOwner1.battery);
        //Faktisk output: new Remotes("Patrick", "10 feet", 50)
        //Testresultat: PASS

        //Testcase:
        //Testinput: "usamah"
        //Forventet output: new Remotes("Usamah", "30 feet", 25)
        Remotes result2 = FunctionFindOwner.findOwner("usamah");
        compareStrings(result2.name, outOwner2.name);
        compareStrings(result2.distance, outOwner2.distance);
        compareInts(result2.battery, outOwner2.battery);
        //Faktisk output: new Remotes("Usamah", "30 feet", 25)
        //Testresultat: PASS

        //Testcase:
        //Testinput: "daniella"
        //Forventet output: new Remotes("Daniella", "40 feet", 69)
        Remotes result3 = FunctionFindOwner.findOwner("daniella");
        compareStrings(result3.name, outOwner3.name);
        compareStrings(result3.distance, outOwner3.distance);
        compareInts(result3.battery, outOwner3.battery);
        //Faktisk output: new Remotes("Daniella", "40 feet", 69)
        //Testresultat: PASS

        //Testcase:
        //Testinput: "danijel"
        //Forventet output: new Remotes("Danijel", "20 feet", 99)
        Remotes result4 = FunctionFindOwner.findOwner("danijel");
        compareStrings(result4.name, outOwner4.name);
        compareStrings(result4.distance, outOwner4.distance);
        compareInts(result4.battery, outOwner4.battery);
        //Faktisk output: new Remotes("Danijel", "20 feet", 99)
        //Testresultat: PASS

        //Testcase:
        //Testinput: "daniella"
        //Forventet output: new Remotes("Mikkel", "5 feet", 41)
        Remotes result5 = FunctionFindOwner.findOwner("mikkel");
        compareStrings(result5.name, outOwner5.name);
        compareStrings(result5.distance, outOwner5.distance);
        compareInts(result5.battery, outOwner5.battery);
        //Faktisk output: new Remotes("Mikkel", "5 feet", 41)
        //Testresultat: PASS



    }

    //Test return method, comparing actual return, with our expectedResult
    static void compareStrings(String result, String expectedResult) {
        if (result.equals(expectedResult)) {
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }
    static void compareInts(int result, int expectedResult){
        if (result == (expectedResult)) {
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }

}

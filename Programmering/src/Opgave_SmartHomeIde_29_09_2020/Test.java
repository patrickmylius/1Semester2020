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
        Object outOwner1 = "patrick";
        String outOwner2;
        String outOwner3;
        String outOwner4;
        String outOwner5;

        Remotes resultOwner = FunctionFindOwner.findOwner("patrick");

        compareObjects(resultOwner, outOwner1);
        System.out.println(resultOwner);

    }

    //Test return method, comparing actual return, with our expectedResult
    static void compareObjects(Object result, Object expectedResult) {
        if (result.equals(expectedResult)) {
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }

}

/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 29-09-2020
 */
package LayerSelektions_07;

public class Test {
    public static void main(String[] args) {
        //declaring expected String result variables
        String out1 = "Der er 10 eller mere i mellem x og y";
        String out2 = "Der er ikke 10 i mellem x og y";

        //Testcase: 1
        //Input: x = 3, y = 13;
        //Expected output: "Der er 10 eller mere i mellem x og y"
        String result = Function.compute(3, 13);
        compareStrings(result, out1);
        //Actual output: "Der er 10 eller mere i mellem x og y"
        //Test result: PASS

        //Testcase: 2
        //Input x = 0, y = 9
        //Expected output: "Der er ikke 10 i mellem x og y"
        String result2 = Function.compute(0, 9);
        compareStrings(result2, out2);
        //Actual output: "Der er ikke 10 i mellem x og y"
        //Test result: PASS

    }

    //Test method, comparing actual string output, with our expectedResult
    static void compareStrings(String result, String expectedResult) {
        if (result.equals(expectedResult)) {
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }
}

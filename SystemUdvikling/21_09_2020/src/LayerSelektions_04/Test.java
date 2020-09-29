/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 29-09-2020
 */
package LayerSelektions_04;

public class Test {
    public static void main(String[] args) {
        //Declaring string outs, as variables.
        String out1 = "first variable has the highest value";
        String out2 = "second variable has the highest value";
        String out3 = "third variable has the highest value";


        //Testcase: First value = highest value
        //Input: first = 12, second = 10, third = 5
        //Expected output: "first variable has the highest value"
        String result = Function.valueCheck(12, 10, 5);
        compareStrings(result, out1);
        //Actual output: "first variable has the highest value"
        //Test result: PASS


        //Testcase: Second value = highest value
        //Input: first = 5, second = 12, third = 10
        //Expected output: "second variable has the highest value"
        String result2 = Function.valueCheck(5, 12, 10);
        compareStrings(result2, out2);
        //Actual output: "second variable has the highest value"
        //Test result: PASS

        //Testcase: Third value = highest value
        //Input: first 3, second 20, third = 21
        //Expected output: "third variable has the highest value"
        String result3 = Function.valueCheck(3, 20, 21);
        compareStrings(result3, out3);
        //Actual output: "third variable has the highest value"
        //Test result: PASS


    }

    //Test method, comparing actual string output, with our expectedResult
    static void compareStrings(String result, String expectedResult) {
        if (result.equals(expectedResult)) {
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }
}

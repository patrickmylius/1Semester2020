/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 28-09-2020
 */
package LayerSelektions_03;

public class Test {
    public static void main(String[] args) {
        String out1 = "first variable is higher than the second variable";
        String out2 = "second variable is higher than the first variable";
        //Testcase
        //Input: first = 5, second = 3
        //forventet output = first variable is higher than the second variable
        String result = Function.sammenLign(5, 3);
        testMethod(result,out1);
        //faktisk output: out1


        //Testcase:
        //Input: first = 7, second = 3
        //forventet output = second variable is higher than the first variable
        String result2 = Function.sammenLign(7, 8);
        testMethod(result2, out2);
        //faktisk output:

    }
    static void testMethod(String result, String result2) {
        if (result.equals(result2)) {
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }
}

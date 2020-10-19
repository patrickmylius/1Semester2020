/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 19-10-2020
 */
package Opgave_BilKomplet_19_10_2020;

public class CarTest {

    public static void main(String[] args) {
        testSuite();
        testCorrectKey();

    }


    private static void testSuite() {
        System.out.println("Testsuite runs");
        System.out.print("Test 1 (Car must be on): ");
        testCorrectKey();
        System.out.print("Test 2 (Car must be off): ");
        testWrongKey();

    }

    private static void testCorrectKey() {
        Car peugeot = new Car();
        CarKey peugeotKey = new CarKey("password1234");

        peugeot.turnEngineOn(peugeotKey);
    }

    private static void testWrongKey() {
        Car peugeot = new Car();
        CarKey peugeotKey = new CarKey("password123");

        peugeot.turnEngineOn(peugeotKey);

    }


}

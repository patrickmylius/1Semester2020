/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 19-10-2020
 */
package Opgave_BilKomplet_19_10_2020;
//Testclass running test methods
public class CarTest {

    public static void main(String[] args) {
        testSuite();

    }

    //Test suit
    //Test 1/2: Car turning on off
    //Test 3: Aircon on
    private static void testSuite() {
        System.out.println("Testsuite runs");
        System.out.print("Test 1 (Car must be on): ");
        testCorrectKey();
        System.out.print("Test 2 (Car must be off): ");
        testWrongKey();
        System.out.println("Test 3 (Aircon must be on): ");
        testAircon();


    }
    //Method testing start car, with correct key "password"
    private static void testCorrectKey() {
        Car peugeot = new Car();
        CarKey peugeotKey = new CarKey("password1234");

        peugeot.turnEngineOn(peugeotKey);
    }
    //Method testing start car , with wrong key "password"
    private static void testWrongKey() {
        Car peugeot = new Car();
        CarKey peugeotKey = new CarKey("password123");

        peugeot.turnEngineOn(peugeotKey);

    }

    // Method contains object car/ui
    // tests turnAirconOn
    private static void testAircon() {
        Car peugot = new Car();
        UserInterface ui = new UserInterface();
        peugot.setUI(ui);

        peugot.turnAirconOn();

    }


}

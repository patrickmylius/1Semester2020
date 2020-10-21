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
        System.out.println("Testsuite runs\n");
        System.out.println("Tester enum");
        System.out.println("Test 1 (EngineState must be on: ");
        testEnum();
        System.out.print("Test 2 (Car must be on): ");
        testCorrectKey();
        System.out.print("Test 3 (Car must be off): ");
        testWrongKey();
        System.out.print("\nTest 4 (Aircon must be on): ");
        testAircon();
        System.out.print("\nTest 5 (GPS must turn on): ");
        testGPSon();
        System.out.println("Test 6 (GPS must be off): ");
        testGPSoff();


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
    //Method constains object car/ui
    //Test if gps activates
    private static void testGPSon() {

        Car peogot = new Car();
        UserInterface ui2 = new UserInterface();
        peogot.setUI(ui2);

        peogot.gpsActivate();

    }
    //Method constains object car/ui
    //Test if gps turns off, when engine is not on
    private static void testGPSoff() {
        Car peogot = new Car();
        UserInterface ui3 = new UserInterface();
        peogot.setUI(ui3);

        peogot.gpsDeactivate();
    }

    private static void testEnum() {
        System.out.println("EgineState: " + EngineState.ON);
    }


}

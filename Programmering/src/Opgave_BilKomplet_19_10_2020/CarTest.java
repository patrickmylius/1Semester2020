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
        System.out.println("_________________________\n");
        //Testing class enums
        System.out.println("Testing Enum");
        System.out.println("_________________________");
        System.out.println("Test 1 (EngineState must be on): ");
        testEnum();
        System.out.println("Test 2 (Model must be a ferrari): ");
        testModelEnum1();
        System.out.println("Test 3 (Model must be Opel): ");
        testModelEnum2();
        System.out.println("Test 4 (Model + function)");
        testModelEnumFunctions();


        //Testing car Functions
        System.out.println("\nTesting Car functions. ");
        System.out.println("_________________________");
        System.out.println("Test 3 (Car must be on): ");
        testCorrectKey();
        System.out.println("Test 4 (Car must be off): ");
        testWrongKey();
        System.out.println("Test 5 (input < 20, aircon must be on, input < 20, aircon must be off): ");
        testAircon();
        System.out.println("Test 6 (GPS must turn on): ");
        testGPSon();
        System.out.println("Test 7 (GPS must be off): ");
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

    //Method souting EngineState + enum
    private static void testEnum() {
        System.out.println("EgineState: " + EngineState.ON);
    }

    //Method souting carModel + enum
    private static void testModelEnum1() {
        System.out.println("CarModel: " + Model.Ferrari);
    }

    //Method souting carModel + enum
    private static void testModelEnum2() {
        System.out.println("CarModel: " + Model.Opel);
    }

    //Testing using enum to chose a car in Enum class
    //Decided by user input
    private static void testModelEnumFunctions() {
        String carModel = Car.choseCarModel();
        System.out.println("\n" + carModel);
        System.out.println("_________________________");

    }


}

import zunit.TestSuit;

/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 22-10-2020
 */

public class TestClass extends TestSuit {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();

    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.runTestSuit();

    }

    private void passingTest() {

    }
    private void failingTest() {

    }
}

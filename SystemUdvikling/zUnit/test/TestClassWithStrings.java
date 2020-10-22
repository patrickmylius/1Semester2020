import zunit.TestSuite;

/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 22-10-2020
 */

public class TestClassWithStrings extends TestSuite {
    @Override
    public void testMethodList() {
        passingTest();
        failingTest();

    }

    public static void main(String[] args) {
        TestClassWithStrings testClass = new TestClassWithStrings();
        testClass.runTestSuit();

    }

    private void passingTest() {
        assertEquals(new String("5"), new String("5"));

    }

    private void failingTest() {
        assertEquals(new String("5"), new String("7"));
    }
}

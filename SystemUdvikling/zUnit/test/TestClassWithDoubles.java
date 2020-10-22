import zunit.TestSuit;

/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 22-10-2020
 */

public class TestClassWithDoubles extends TestSuit {
    @Override
    public void testMethodList() {
        passingTest();
        failingTest();

    }

    public static void main(String[] args) {
        TestClassWithLongs testClass = new TestClassWithLongs();
        testClass.runTestSuit();

    }

    private void passingTest() {
        assertEquals(5.0, 5.0);

    }

    private void failingTest() {
        assertEquals(3.0, 7.0);
    }
}

import zunit.TestSuite;

/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 22-10-2020
 */

public class TestClassWithLongs extends TestSuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();

    }

    public static void main(String[] args) {
        TestClassWithLongs testClass = new TestClassWithLongs();
        testClass.runTestSuite();

    }

    private void passingTest() {
        assertEquals(5L, 5L);

    }

    private void failingTest() {
        assertEquals(3L, 7L);
    }
}

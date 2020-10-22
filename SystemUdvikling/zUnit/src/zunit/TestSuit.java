package zunit;

/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 22-10-2020
 */

public abstract class TestSuit {
    private int passed; //Private, only visible for this class
    private int failed;

    public void runTestSuit() {
        passed = 0;
        failed = 0;

        testMethodList();

        System.out.println("Test passed: " + passed);
        System.out.println("Test failed: " + failed);

    }

    public abstract void testMethodList();

    public void assertEquals(int expected, int actual) {

    }
}

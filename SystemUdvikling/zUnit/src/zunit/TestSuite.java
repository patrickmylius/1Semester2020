package zunit;

/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 22-10-2020
 */

public abstract class TestSuite {
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

    //Compare ints
    public void assertEquals(int expected, int actual) {
        if (expected == actual) {
            passed++;
        } else {
            failed++;
            System.out.println("Test " + (passed + failed) + " has failed.\n" + "Expected result: " + expected + "\n" +
                    "Actual result: " + (actual) + "\n ");
        }
    }

    //Compare Strings
    public void assertEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            passed++;
        } else {
            failed++;
            System.out.println("Test " + (passed + failed) + " has failed.\n" + "Expected result: " + expected + "\n" +
                    "Actual result: " + (actual) + "\n ");
        }
    }

    //Compare longs - valueOf().equals()
    public void assertEquals(long expected, long actual) {
        if (Long.valueOf(expected).equals(Long.valueOf(actual))) {
            passed++;
        } else {
            failed++;
            System.out.println("Test " + (passed + failed) + " has failed.\n" + "Expected result: " + expected + "\n" +
                    "Actual result: " + (actual) + "\n ");
        }
    }

    //Compare doubles - (Lacking delta) for truly computing double equality.
    public void assertEquals(double expected, double actual) {
        if (expected == actual) {
            passed++;
        } else {
            failed++;
            System.out.println("Test " + (passed + failed) + " has failed.\n" + "Expected result: " + expected + "\n" +
                    "Actual result: " + (actual) + "\n ");
        }
    }
}

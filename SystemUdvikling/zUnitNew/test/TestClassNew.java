import zunit.TestSuit;

/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 22-10-2020
 */

public class TestClassNew extends TestSuit {
    @Override
    public void testMethodList() {
        assertEquals(5, 5);//Ints
        assertEquals("5", "5");//String
        assertEquals(5L, 5L);//Longs
    }

    public static void main(String[] args) {
        new TestClassNew().runTestSuit();
    }
}

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
        //Test 1:
        assertEquals(5, 5);//Ints
        //Test 2:
        assertEquals(3, 7);//Ints
        //Test 3:
        assertEquals("5", "5");//String
        //Test 4:
        assertEquals("3" , "7");//String
        //Test 5:
        assertEquals(5L, 5L);//Longs
        //Test 6:
        assertEquals(3L, 7L);//Longs
        //Test 7:
        assertEquals(5.0, 5.0);//Doubles
        //Test 8:
        assertEquals(3.0, 7.0);//Doubles
    }

    public static void main(String[] args) {
        new TestClassNew().runTestSuit();
    }
}

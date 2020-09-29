/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 29-09-2020
 */
package Opgave_SmartHomeIde_29_09_2020;
//Test class for SmartHomeIde Assignment
public class Test {
    public static void main(String[] args) {
        //Currently hit a wall, due to the reason
        //That i can find my way, of what to catch on the object return.
        //Which makes it impossible for me, to match actual result with expected result.
        Object outOwner1 = "patrick"; 
        /* Det giver ikke mening at erklære dit forventede output som et Object-objekt 
         * fordi findOwner-metoden returnere et Remotes-objekt!
         * Grunden til at dit program kan kompilere er at Object er superklasse til ALLE klasser.
         */
        String outOwner2;
        String outOwner3;
        String outOwner4;
        String outOwner5;

        Remotes resultOwner = FunctionFindOwner.findOwner("patrick");

        compareObjects(resultOwner, outOwner1);
        /* I stedet for at sammenligne objekter, 
         * så overvej at sammenligne resultOwner.name med "Patrick". 
         * Dvs. at du kan bruge samme compareStrings-metode som du lavede i går.
         */
        System.out.println(resultOwner);

    }

    //Test return method, comparing actual return, with our expectedResult
    static void compareObjects(Object result, Object expectedResult) {
        if (result.equals(expectedResult)) { 
            /* Object.equals-metoden er som udgangspunkt implementeret til kun at returnere lighed 
             * såfremt to objektreferencer reelt refererer til SAMME objekt. 
             * Det er altså ikke nok at objekterne har samme type og indhold.
             * Denne adfærd kan overrides ved at implementere equals-metoden i subklassen, fx Remotes-klassen. 
             * I din egen implementation af remotes kan du så angive at lighed er givet ved fx at Remotes.name er ens. 
             * String-klassen har sådan en override af equals-metoden, der netop sammenligner tekststrengenes indhold.
             *
             * Når det så er sagt, så er det ikke nødvendigvis den bedste løsning at lave en equals-metode 
             * hvis du kun skal bruge den til test.
             */
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }

}

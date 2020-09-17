// Lav en metode max, der tager to arrays af int som parametre.
// Metoden skal finde den største af elementerne med samme index
// og placere det i det array som står som den første parameter,
// på den position hvor de begge stod.

public class Metoder_10 {
    public static void main(String[] args) {
        //instantiering af de 2 int arrays numre
        int først[] = {5, 42, 9, 53, 3, 10};
        int andet[] = {3, 9, 19, 33, 10, 1};
        //Max metode kald
        max(først, andet);
        //printArray metode kald
        printArray(først);
        printArray(andet);
    }

    //metode add som tager i mod array af typen int[] finder de største elementer med samme index.
    static void max(int numre1[], int numre2[]) {
        for (int i = 0; i < numre1.length; i++) {
            while (numre1[i] < numre2[i])//while loop, så længe numre1[i] er mindre end numre2[i]
                numre1[i] = numre2[i];
        }
    }

    //metode som tager imod 2 int[] arrays og souter array[i] indhold
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
            System.out.println();

        }
    }
}

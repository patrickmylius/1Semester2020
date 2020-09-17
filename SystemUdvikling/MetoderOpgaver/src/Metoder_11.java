// Lav en metode swap, der tager to arrays af int som parametre.
// Metoden skal ombytte elementerne med samme index

public class Metoder_11 {
    public static void main(String[] args) {
        //instantiering af de 2 int arrays numre
        int først[] = {5, 42, 9, 53, 3, 10};
        int andet[] = {3, 9, 19, 33, 10, 1};
        //swap metode kald
        swap(først, andet);
        //printArray metode kald
        printArray(først);
        printArray(andet);
    }

    //metode swap som tager i mod array af typen int[] finder elementer med samme index og bytter deres plads
    static void swap(int numre1[], int numre2[]) {
        for (int i = 0; i < numre1.length; i++) {
            int swapping = numre1[i];
            numre1[i] = numre2[i];
            numre2[i] = swapping;

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

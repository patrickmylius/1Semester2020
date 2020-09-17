// Lav en metode add, der tager to arrays af int som parametre.
// Metoden skal beregne summen af elementerne med samme index og
// placere den i det array som står som den første parameter, på den position hvor de begge stod.

public class Metoder_09 {

    public static void main(String[] args) {
        //instantiering af arrays med numre først og andet
        int først[] = {5, 42, 9, 53, 3, 10};
        int andet[] = {3, 9, 19, 33, 10, 1};

        //køre først og andet gennem add metoden
        add(først, andet);
        //prinArray udskriver først og andet efter add metoden.
        printArray(først);
        printArray(andet);

    }

    //metode add som tager i mod array af typen int[] og beregner sum af første + andet
    static void add(int numre1[], int numre2[]) {
        for (int i = 0; i < numre1.length; i++) {
            numre1[i] += numre2[i];

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

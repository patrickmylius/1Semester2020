// Lav en metode theSmallOneOut,
// der tager et array af int som parameter.
// Metoden gennemløber arrayet og finder det mindste element.
// Metoden sætter i stedet dette elements værdi til den næstmindste værdi.
// Hvis f.eks. arrayet havde følgende udseende før kaldet

public class Metoder_12 {
    public static void main(String[] args) {
        //instantiering af de int array numre
        int tal[] = { 5, 2, 8, 4, 0, 3, 1, 4 };

        //Max metode kald
        theSmallOneOut(tal);
        //printArray metode kald
        printArray(tal);

    }
    static void theSmallOneOut(int tal[]) {
        for (int i = 0; i < tal.length; i++) {
            if (tal[i] >= 0 && tal[i] < tal.length);
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

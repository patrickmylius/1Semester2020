// Lav en metode inc, der tager et array af int
// som parameter og tæller alle elemeneter op og med 1.
public class Metoder_08 {
    //metode som tager i mod et array af typen int og souter alle ints
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
            System.out.println(" ");
        }
    }

    //metode  som tager i mod et array af typen int og tilføjer +1 til alle ints
    static void inc(int[] addOne) {
        for (int i = 0; i < addOne.length; i++) {
            addOne[i]++;

        }
    }

    public static void main(String[] args) {
        //instantiering af array numbers
        int[] numbers = {10, 8, 6, 3, 2, 4, 7, 1, 5, 9};

        inc(numbers);//metode inc, tager imod array integers, "numbers"
        printArray(numbers);//metode printArray "numbers" souter "numbers" efter de er blevet +1 i inc() metoden
    }
}

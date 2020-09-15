//Lav et program der beregner n! af en variabel.
//SE SystemUdvikling/10_09_2020/src/testFakultet.java (Test af fakultet)
import java.util.Scanner;

public class Iteration_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //souts bruger for ønskede tal
        System.out.print("Beregn fakultet af tallet: ");
        int n = input.nextInt();
        int fakultet = 1;
        //beregner fakultet
        for (int i = n; i > 1; i--) {
            fakultet *= i;
        }
        System.out.println(fakultet);


    }
}

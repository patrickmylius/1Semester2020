/***/
// Lav et program der erklærer to variabler minimum og maximum
// sætter minimum og maximum til værdier du selv vælger, således at
// minimum < maximum
public class Iteration_08 {
    public static void main(String[] args) {
        //set minimum to 10 and maximum to 20, can be set to any aslong as min < max
        int min = 10;
        int max = 20;
        //set tal to 0 and antal to 0
        int tal = 0;
        int antal = 0;
        //souts even numbers found between 10 and 20, with fori loop
        System.out.println("Even numbers from " + min + " to " + max + " are: ");
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                tal += i;//multiplies even numbers set to variable tal
                antal++;//adds 1 to variable antal
                //souts all even numbers found
                System.out.println(i + " ");
                ;
            }
        }
        //computes average number between min and max
        int averageNumb = tal / antal;
        System.out.println("Average number between " + min + " and " + max + " is " + averageNumb);
    }
}

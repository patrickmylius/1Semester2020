//Lav et program der beregner summen af tallene i intervallet [-10 : 10]

public class Iteration_01 {
    public static void main(String[] args) {
        //instantiere sum til 0;
        int sum = 0;
        //fori loop som souter summene af alle tallene mellem -10 : 10
        for (int i = 10; i >= -10; i--) {
            sum += i;
            //souter getagene resultat af (i)
            System.out.println("Sum: " + sum);
        }
    }

}

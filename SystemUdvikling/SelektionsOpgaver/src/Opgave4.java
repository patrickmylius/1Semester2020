public class Opgave4 {
    /*Lav en udvidelse af din løsning til den foregående opgave,
    så den kan finde den største af tre variable,
     kald den tredie variabel third.*/
    public static void main(String[] args) {
            //Input: first = 25, second = 27, third = 45
            //forventet output: "45 + third variable are the highest"
            int first = 25;
            int second = 27;
            int third = 45;
            if (first > second && first > third)
                System.out.println(first + " first variable are the highest");
            if (second > first && second > third)
                System.out.println(second + " second variable are the highest");
            if (third > first && third > second)
                System.out.println(third + " third variable are the highest");
            if (first == second && first == third)
                System.out.println(first + " and " + second + " and " + third + " are all equal ");
            //faktisk output: "45 + third variable are the highest"
            //test resultat: pass

            //Input: first = 2354234, 2325342, third = 2334555
            //forventet output = "first variable is higher than the second variable"
            first = 2354234;
            second = 2325342;
            third = 2334555;
            if (first > second && first > third)
            System.out.println(first + " first variable are the highest");
            if (second > first && second > third)
            System.out.println(second + " second variable are the highest");
            if (third > first && third > second)
            System.out.println(third + " third variable are the highest");
            if (first == second && first == third)
            System.out.println(first + " and " + second + " and " + third + " are all equal ");
            //faktisk output "2354234 first variable are the highest"
            //test resultat: pass

            //Input: first = 500, second = 500, third = 600
            //forventet output: "500 first 500 second 500 third variables, are all equal"
            first = 500;
            second = 500;
            third = 500;
            if (first > second && first > third)
            System.out.println(first + " first variable are the highest");
            if (second > first && second > third)
            System.out.println(second + " second variable are the highest");
            if (third > first && third > second)
            System.out.println(third + " third variable are the highest");
            if (first == second && first == third)
            System.out.println(first + " first " + second + " second " + third + " third variables, are all equal ");
            //forventet output: "500 first 500 second 500 third variables, are all equal"
            //test resultat: pass
    }
}

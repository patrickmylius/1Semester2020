public class Selektion_03 {
    //TEST CASE Lav et program der:
    //Erklærer to variable first og second.
    //Sætter first og second til værdier du selv vælger
    //Undersøger hvilken af de to variable der har den største værdi og udskriver denne
    //Test dit program med forskellige værdier for first og second.
    public static void main(String[] args) {
        //Input first = 25 , second = 27
        //forventet output = "second variable is higher than the first variable"
        int first = 25;
        int second = 27;
        testHigherVariable(first, second);
        //faktisk output "second variable is higher than the first variable"
        //test resultat: pass

        //Input first = 2354234, second = 2325342
        //forventet output = "first variable is higher than the second variable"
        first = 2354234;
        second = 2325342;
        testHigherVariable(first, second);
        //faktisk output "first variable is higher than the second variable"
        //test resultat: pass

        //Input first = 500, second = 500
        //forventet output = "first and second varaible are equal"
        first = 500;
        second = 500;
        testHigherVariable(first, second);
        //faktisk output "first and second variable are equal"'
        //test resultat: pass
    }
    static void testHigherVariable(int first, int second){
        String out1 = "First variable is higher than the second variable";
        String out2 = "Second variable is higher than the first variable";
        String out3 = "First and second variable are equal";
        if (first > second)
            System.out.println(out1);
        if (first < second)
            System.out.println(out2);
        if (first == second)
            System.out.println(out3);
    }
}

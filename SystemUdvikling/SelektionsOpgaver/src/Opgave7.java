public class Opgave7 {
    /*Lav et program der:
    Erklærer to variable x og y.
    Sætter x, y til værdier du selv vælger.
    Fortæller om forskellen mellem x og y er mere end ti.

    Test dit program med forskellige værdier for x og y.*/
    public static void main(String[] args) {
        //TESTCASE
        //Input: x = 50, y = 10;
        //forventet output: 40
        int x = 50;
        int y = 10;
        if (x - y >= 10 || y - x <= -10)
            System.out.println(x - y);
        else
            System.out.println("Der er mindre end 10 i mellem x og y");
        //faktisk output: "40"
        //test resultat: pass

        //TESTCASE
        //Input: x = 20, y = 10;
        //forventet output: 10
        x = 20;
        y = 10;
        if (x - y >= 10 || y - x <= -10)
            System.out.println(x - y);
        else
            System.out.println("Der er mindre end 10 i mellem x og y");
        //faktisk output: "10"
        //test resultat: pass

        //TESTCASE
        //Input: x = 19, y = 10;
        //forventet output: "Der er mindre end 10 i mellem x og y"
        x = 19;
        y = 10;
        if (x - y >= 10 || y - x <= -10)
            System.out.println(x - y);
        else
            System.out.println("Der er mindre end 10 i mellem x og y");
        //faktisk output: "Der er mindre end 10 i mellem x og y"
        //test resultat: pass

    }
}

public class Opgave6 {
    /*Lav et program der:
    Erklærer tre variable x, y og z.
    Sætter x, y og z til værdier du selv vælger.
    Udskriver den mellemste værdi.
    Test dit program med forskellige værdier for x, y og z.*/
    public static void main(String[] args) {

        //TESTCASE
        //Input: x = 10, y = 15, z = 20;
        //forventet output = "15"
        int x = 10;
        int y = 15;
        int z = 20;
        if ((x > y && x < z) || (x < y && x > z))
            System.out.println(x);
        else if ((y > x && y < z) || (y < x && y > z))
            System.out.println(y);
        else if ((z > x && z < y) || (z < x && z < y))
            System.out.println(z);
        else
            System.out.println("Den midterste værdi findes ikke");
        //faktisk output: "15"
        //testresultat: pass

        //TESTCASE
        //Input x = 200, y = 150, z = 300
        //forventet output = 200
        x = 200;
        y = 150;
        z = 300;
        if ((x > y && x < z) || (x < y && x > z))
            System.out.println(x);
        else if ((y > x && y < z) || (y < x && y > z))
            System.out.println(y);
        else if ((z > x && z < y) || (z < x && z < y))
            System.out.println(z);
        else
            System.out.println("Den midterste værdi findes ikke");
        //faktisk output: 200
        //test resultat: pass

        //TESTCASE
        //Input x = 100, y = 100, z = 120
        //Faktisk output: "Den midterste værdi findes ikke"
        x = 100;
        y = 100;
        z = 200;
        if ((x > y && x < z) || (x < y && x > z))
            System.out.println(x);
        else if ((y > x && y < z) || (y < x && y > z))
            System.out.println(y);
        else if ((z > x && z < y) || (z < x && z < y))
            System.out.println(z);
        else
            System.out.println("Den midterste værdi findes ikke");
        //faktisk output: "Den midterste værdi findes ikke"
        //test resultat: pass

    }
}

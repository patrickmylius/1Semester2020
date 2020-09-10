public class Opgave1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;
        //TEST A
        //Evaluer følgende boolske udtryk udtryk
        //x <= 5 && z != y
        //TESTCASE
        //Input: x = 10, y = 12 , z = 7.
        //Forventet OUTPUT: true
        boolean a = x <= 5 && z != y;
        if (a == true)
            System.out.println("A: PASS");
        else
            System.out.println("A: FAIL");
        //Faktisk output: true
        //Testresultat: PASS

        //TEST B
        //Evaluer følgende boolske udtryk
        //x == 5 || x == y && z == 3
        //TESTCASE
        //Input: x = 5, y = 8, z = 3
        //Forventet output: false
        boolean b = x == 5 || x == y && z == 3;
        if (b == false)
            System.out.println("B: PASS");
        else
            System.out.println("B: FAIL");
        //Faktisk output: false
        //Test resultat: PASS

        //TEST C
        //Evaluer følgende boolske udtryk
        //x / y > z / x
        //TESTCASE
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: false
        boolean c = x / y > z / x;
        if (c == false)
            System.out.println("C: PASS");
        else
            System.out.println("C: FAIL");
        //Faktisk output: false
        //testresultat: Pass

        //TEST D
        //Evaluer følgende boolske udtryk
        //TESTCASE
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: true
        boolean d = !(x != y - z) == false;
        if (d == true)
            System.out.println("D: PASS");
        else
            System.out.println("D: FAIL");
        //Faktisk output: false
        //Test resultat: FAIL

        //TEST E
        //Evaluer følgende boolske udtryk
        //2 * x != x || x == 0
        //TESTCASE
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: True
        boolean e = 2 * x != x || x == 0;
        if (e == true)
            System.out.println("E: PASS");
        else
            System.out.println("E: FAIL");
        //Faktisk output: true
        //Test resultat: pass

        //TEST F
        //Evaluer følgende boolske udtryk'
        //2 * x != x || x == 0
        //TESTCASE
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: True
        boolean f = !true || !false;
        if (f = true)
            System.out.println("D: PASS");
        else
            System.out.println("D: FAIL");
        //Faktisk output: true
        //Test resultat = PASS


    }
}

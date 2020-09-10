public class Opgave1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;
        //TEST A
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
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: true
        boolean b = x == 5 || x == y && z == 3;
        if (b == true)
            System.out.println("B: PASS");
        else
            System.out.println("B: FAIL");
        //Faktisk output: True
        //Testresultat: PASS

        //TEST C
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: True
        boolean c = x / y > z / x;
        if (c == false)
            System.out.println("C: PASS");
        else
            System.out.println("C: FAIL");
        //Faktisk output: PASS
        //testresultat: true

        //TEST D
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: True
        boolean d = !(x != y - z) == false;
        if (d == false)
            System.out.println("D: PASS");
        else
            System.out.println("D: FAIL");
        //Faktisk output: true
        //Test resultat: Pass

        //TEST E
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
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: True
        boolean f = ! true || ! false;
        if (f = true)
            System.out.println("D: PASS");
        else
            System.out.println("D: FAIL");
        //Faktisk output: true
        //Test resultat = PASS


    }
}

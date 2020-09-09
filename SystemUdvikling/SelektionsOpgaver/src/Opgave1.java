public class Opgave1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;

        //TEST A
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: True
        Boolean a = x <= 5 && z != y;
        if (a == true)
            System.out.println("A: PASS");
        else
            System.out.println("A: FAIL");
        //Faktisk output: True
        //Testresultat: PASS

        //TEST B
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: PASS
        Boolean b = x == 5 || x == y && z == 3;
        if (b == true)
            System.out.println("B: PASS");
        else
            System.out.println("B: FAIL");
        //Faktisk output: True
        //Testresultat: PASS

        //TEST C
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: PASS
        Boolean c = x / y > z / x;
        if (c == false)
            System.out.println("C: PASS");
        else
            System.out.println("C: FAIL");
        //Faktisk output: PASS

        //TEST D
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: PASS
        Boolean d = !(x != y - z) == false;
        if (d == false)
            System.out.println("D: PASS");
        else
            System.out.println("D: FAIL");
        //Faktisk output: PASS

        //TEST E
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: PASS
        Boolean e = 2 * x != x || x == 0;
        if (e == true)
            System.out.println("E: PASS");
        else
            System.out.println("E: FAIL");
        //Faktisk output: PASS

        //TEST F
        //Input x = 5, y = 8, z = 3.
        //Forventet OUTPUT: PASS
        Boolean f = ! true || ! false;
        if (f = true)
            System.out.println("D: PASS");
        else
            System.out.println("D: FAIL");
        //Faktisk output: PASS

        //Test resultat = PASS


    }
}

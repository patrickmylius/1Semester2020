public class testFakultet {
    public static void main(String[] args) {
        //input: fakultet af "5"
        //forventet output: "fakultet = 120 PASS"
        int n = 5;
        int x = 4;
        int z = 3;
        int f = 2;
        int p = 0;
        int c = -5;
        int fakultet = 1;

        //Input: 5
        //forventet: output 120
        for (int i = n; i > 1 ; i--) {
            fakultet *= i;
        }
            System.out.println(fakultet);

            if (fakultet == 120)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
            //faktisk output 120
            //testresultat pass


        //input: 4
        //forventet: output 24
        fakultet = 1;
        for (int i = x; i > 1 ; i--) {
            fakultet *= i;
        }
            System.out.println(fakultet);

            if (fakultet == 24)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
            //faktisk output: 24
            //Testresultat: pass

        //input 3
        //forventet output 6
        fakultet = 1;
        for (int i = z; i > 1 ; i--) {
            fakultet *= i;
        }
            System.out.println(fakultet);

            if (fakultet == 6)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
            //faktisk output 6
            //testresultat "PASS"

        //input: 2
        //forventet: output 2
        fakultet = 1;
        for (int i = f; i > 1 ; i--) {
            fakultet *= i;
        }
            System.out.println(fakultet);
            if (fakultet == 2)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
            //faktisk output 2

        //input: 0
        //forventet: output 1
        fakultet = 1;
        for (int i = p; i > 1 ; i--) {
            fakultet *= i;
        }
            System.out.println(fakultet);

            if (fakultet == 1)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
            //faktisk output: 1
            //testresultat: pass

        //input: -5
        //forventet: output 1
        fakultet = 1;
        for (int i = c; i > 1 ; i--) {
            fakultet *= i;
        }
            System.out.println(fakultet);

            if (fakultet == 1 )
                System.out.println("PASS");
            else
                System.out.println("FAIL");
            //faktisk: output 1
            //testresultat: pass


    }
}

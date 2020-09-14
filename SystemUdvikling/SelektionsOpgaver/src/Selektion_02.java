public class Selektion_02 {
    public static void main(String[] args) {
        //TESTCASE
        //Input x = 41, y = 67
        //forventet output = "Summen er større end hundrede"
        int x = 41;
        int y = 67;
        String output = "Summen er ikke større end hundrede";
        int resultat = x + y;
        if (resultat > 100)
            output = "Summen er større end hundrede";
        System.out.println(output);
        //test kode
        if (output == "Summen er større end hundrede")
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        //faktisk output = "Summen er større end hundrede"
        //test resultat: pass

        //TESTCASE
        //Input x = 30, y = 69
        //forventet output = "Summen er ikke større end hundrede";
        x = 30;
        y = 69;
        output = "Summen er ikke større end hundrede";
        resultat = x + y;
        if (resultat > 100)
            output = "Summen er større end hundrede";
        System.out.println(output);
        //Testkode
        if (output == "Summen er ikke større end hundrede")
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        //faktisk output: "Summen er ikke større end hundrede";
        //Test resultat: pass

        //TESTCASE
        //Input x = 100, y = 100
        //forventet output = "Summen er større end hundrede"
        x = 100;
        y = 100;
        output = "Summen er ikke større end hundrede";
        resultat = x + y;
        if (resultat > 100)
            output = "Summen er større end hundrede";
        System.out.println(output);
        //Testkode
        if (output == "Summen er større end hundrede")
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        //faktisk output: "Summen er større end hundrede"
        //test resultat: pass
    }
}

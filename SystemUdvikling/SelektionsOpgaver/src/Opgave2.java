public class Opgave2 {
    public static void main(String[] args) {
        //Input x = 41, y = 67
        //forventet output = "Summen er større end hundrede"
        //program kode
        int x = 41;
        int y = 67;
        String output = "";
        int resultat = 41 + 67;

        if (resultat > 100)
            output = "Summen er større end hundrede";
        System.out.println(output);
        //test kode
        if (output == "Summen er større end hundrede")
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        //faktisk output = PASS

        //Input x = 30, y = 69
        //forventet output = "";
        //Program code
        x = 30;
        y = 70;
        output = "";
        resultat = 30 + 70;

        if (resultat > 100)
            output = "Summen er større end hundrede";
        System.out.println(output);
        //Testkode
        if (output == "")
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        //Input x = 100, y = 100
        //forventet output = "Summen er større end hundrede"
        //Program code
        x = 100;
        y = 100;
        output = "";
        resultat = 100 + 100;

        if (resultat > 100)
            output = "Summen er større end hundrede";
        System.out.println(output);
        //Testkode
        if (output == "Summen er større end hundrede")
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }
}

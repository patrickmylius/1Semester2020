import javax.swing.*;

public class Opgave5 {
    /* I denne opgave skal vi arbejde med intervaller.
    Lav et program der:
    Erklærer en variable x.
    Sætter x til en værdi i intervallet [0:99] som du selv vælger.
    Udskriver hvilket "tier-interval" (0..9, 10..19, ... , 90..99) x tilhører.

    F.eks. skal programmet udskrive:
    62 tilhører [60:69]
    hvis x er 62
    Test dit program med forskellige værdier for x.*/
    public static void main(String[] args) {
        //TESTCASE
        //Input: x = 62, tier = x/10
        //forventet output: "62 tilhører [60:69]"
    int x = 62;
    int tier = x/10;
    if (tier > 0 && tier <= 9)
        System.out.println(x + " tilhører intervallet" + " [" + tier + "0:" + tier + "9" + "]");
        else System.out.println("FAIL");
        //faktisk output: "62 tilhører [60:69]"
        //Test resultat: pass

        //TESTCASE
        //Input: x = 99, tier = x/10
        //forventet output: "99 tilhører intervallet [90:99]"
        x = 99;
        tier = x/10;
        if (tier > 0 && tier <= 9)
            System.out.println(x + " tilhører intervallet" + " [" + tier + "0:" + tier + "9" + "]");
        else System.out.println("fail");
        //faktisk input "99 tilhører intervallet [90:99]"
        //test resultat: pass

        //TESTCASE
        //Input: x = 101, tier = x/10
        //forventet output: fail
        x = 101;
        tier = x/10;
        if (tier > 0 && tier <= 9)
            System.out.println(x + " tilhører intervallet" + " [" + tier + "0:" + tier + "9" + "]");
        else System.out.println("fail");
        //faktisk input "fail"
        //test resultat: pass

        //TESTCASE
        //Input: x = -1, tier = x/10
        //forventet output: "fail"
        x = -1;
        tier = x/10;
        if (tier > 0 && tier <= 9)
            System.out.println(x + " tilhører intervallet" + " [" + tier + "0:" + tier + "9" + "]");
        else System.out.println("fail");
        //faktisk output: "fail"
        //test resultat: pass


    }
}

//Lav en metode midterst, der tager tre tal som parametre.
// Metoden skal returnere den midterste værdi.
// F.eks. skal kaldet midterst (6, 10, 8) returnere 8:

public class Metoder_03 {
    //metode miderst, tager 3 int som parametre og tjekker dem mod hinanden, for at finde det midterste tal.
    static int midterst(int tal1, int tal2, int tal3){
        int midterTal = 0;
        if ( tal1 <= tal2 && tal2 <= tal3 || tal3 <= tal2 && tal2 <= tal1 )
            midterTal = tal2;
        else if ( tal2 <= tal1 && tal1 <= tal3 || tal3 <= tal1 && tal1 <= tal2 )
            midterTal = tal1;
        else
            midterTal = tal3;
        return midterTal;
    }
    //start
    public static void main(String[] args) {
        //souts 8
        System.out.println(midterst(6, 10, 8));
        //souts 99
        System.out.println(midterst(99, 66, 99));
        //souts 25
        System.out.println(midterst(-50, 25, 50));
    }


}

public class Selektion_08 {
    /*Lav et program der:
 	Erklærer en variabel øjne og tildeler den en værdi fra intervallet [1:6] som du selv vælger.
    Udskriver antallet af øjne tekstuelt på formen (idet vi f.eks. antager at øjne er 2):
    Det er en toer
    Hvis øjne ikke ligger i intervallet, skal der udskrives en fejlmeddelelse:
    Forkert antal øjne
    Test dit program med forskellige værdier af øjne, også værdier undenfor intervallet.*/
    public static void main(String[] args) {
        //TESTCASE
        //Test input: 0, 1, 2, 3, 4, 5, 6
        //forventet input:
        // "Forkert antal øjne"
        // "Det er en etter"
        // "Det er en toer"
        // "Det er en treer"
        // "Det er en fire"
        // "Det er en femmer"
        // "Det er en sekser"
        for (int i = 0; i <= 6; i++) {
            int øjne = i;
            switch (øjne) {
                case 1:
                    System.out.println("Det er en etter");
                    break;
                case 2:
                    System.out.println("Det er en toer");
                    break;
                case 3:
                    System.out.println("Det er en treer");
                    break;
                case 4:
                    System.out.println("Det er en fire");
                    break;
                case 5:
                    System.out.println("Det er en femmer");
                    break;
                case 6:
                    System.out.println("Det er en sekser");
                    break;
                default:
                    System.out.println("Forkert antal øjne");
            }
            //faktisk output:
            // "Forkert antal øjne"
            // "Det er en etter"
            // "Det er en toer"
            // "Det er en treer"
            // "Det er en fire"
            // "Det er en femmer"
            // "Det er en sekser"
            //test resultat: pass
        }




    }
}

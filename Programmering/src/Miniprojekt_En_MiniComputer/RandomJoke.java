package Miniprojekt_En_MiniComputer;

import java.util.Random;

public class RandomJoke {
    public static void grin() {
        String[] jokes = {"Jeg overvejer at gifte mig med en tysker er det over grænsen?",
                "Alle børnene gik forbi lorten undtagen Stella hun troede det var Nutella!",
                "Hvad kalder man en indbagt haj? --- En haj med dej!",
                "Hvorfor hyler prærieulve kun om natten? --- De kan kun se kaktusserne om dagen!",
                "Alle børnene gik ind i helikopteren, undtagen Ellen, hun gik ind i propellen!"};

        Random r = new Random();
        int randomString = r.nextInt(jokes.length);
        System.out.println(jokes[randomString]);
    }
}

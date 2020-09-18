package Miniprojekt_En_MiniComputer;

import java.util.Random;
//Patrick
public class RandomJoke {
    public static void grin() {
        //fills array list String
        String[] jokes = {"Jeg overvejer at gifte mig med en tysker er det over grænsen?" + "\n",
                "Alle børnene gik forbi lorten undtagen Stella hun troede det var Nutella!"+ "\n",
                "Hvad kalder man en indbagt haj? --- En haj med dej!"+ "\n",
                "Hvorfor hyler prærieulve kun om natten? --- De kan kun se kaktusserne om dagen!"+ "\n",
                "Alle børnene gik ind i helikopteren, undtagen Ellen, hun gik ind i propellen!"+ "\n"};

        //sets r to be a random sout from array
        Random r = new Random();
        int randomString = r.nextInt(jokes.length);
        //souts joke
        System.out.println(jokes[randomString]);
    }
}

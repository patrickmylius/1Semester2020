package Undervisning7_28_09_2020.Exercise_Statements_MuscleProgram;

//Classfunction holding switch statement, with string input
public class Function {
    //method that takes String muscle
    static String switchMuscle(String muscle) {

        //switch matching muscle with string cases
        //returns muscle after match
        switch (muscle.toLowerCase()) {
            case "chest":
                System.out.println("\nBenchpress, Flyes, Cable press");
                break;
            case "biceps":
                System.out.println("\nBicepcurl, Hammercurl, EZ-bar curls");
                break;
            case "triceps":
                System.out.println("\nPushdown, Skullcrushers, Closegrip benchpress");
                break;
            case "back":
                System.out.println("\nDeadlift, Rows, Pulldowns");
                break;
            case "legs":
                System.out.println("\nSquat, Legpress, Lunges, Leg extensions");
                break;
            case "shoulders":
                System.out.println("\nMilitarypress, Lateral raise, Front raise");
                break;
            case "abs":
                System.out.println("\nCrunches, Leg raises, plank");
        }
        return muscle;
    }

    //Method holding souts with ascii art
    static void motivation() {
        System.out.println("Some extra motivation!");
        System.out.println(" ");
        System.out.println("      ,#####,\n" +
                "                 #_   _#\n" +
                "                 |a` `a|\n" +
                "                 |  u  |\n" +
                "                 \\  =  /\n" +
                "                 |\\___/|\n" +
                "        ___ ____/:     :\\____ ___\n" +
                "      .'   `.-===-\\   /-===-.`   '.\n" +
                "     /      .-\"\"\"\"\"-.-\"\"\"\"\"-.      \\\n" +
                "    /'             =:=             '\\\n" +
                "  .'  ' .:    o   -=:=-   o    :. '  `.\n" +
                "  (.'   /'. '-.....-'-.....-' .'\\   '.)\n" +
                "  /' ._/   \".     --:--     .\"   \\_. '\\\n" +
                " |  .'|      \".  ---:---  .\"      |'.  |\n" +
                " |  : |       |  ---:---  |       | :  |\n" +
                "  \\ : |       |_____._____|       | : /\n" +
                "  /   (       |----|------|       )   \\\n" +
                " /... .|      |    |      |      |. ...\\\n" +
                "|::::/'' jgs /     |       \\     ''\\::::|\n");

    }

    //Method holding sout with askii art
    static void tryAgain() {
        System.out.println("     ////^\\\\\\\\\n" +
                "      | ^   ^ |\n" +
                "     @ (o) (o) @\n" +
                "      |   <   |\n" +
                "      |  ___  |\n" +
                "       \\_____/\n" +
                "     ____|  |____\n" +
                "    /    \\__/    \\\n" +
                "   /              \\\n" +
                "  /\\_/|        |\\_/\\\n" +
                " / /  |        |  \\ \\\n" +
                "( <   |        |   > )\n" +
                " \\ \\  |        |  / /\n" +
                "  \\ \\ |________| / /\n" +
                "   \\ \\|");
    }
}

package Undervisning_28_09_2020.Exercise;

//Classfunction holding switch statement, with string input
public class Function {
    //method that takes String muscle
    //s
    static String switchMuscle(String muscle) {
        //switch matching muscle with string cases
        //returns muscle after match
        switch (muscle.toLowerCase()) {
            case "chest":
                System.out.println("Benchpress, Flyes, Cable press");
                break;
            case "biceps":
                System.out.println("Bicepcurl, Hammercurl, EZ-bar curls");
                break;
            case "triceps":
                System.out.println("Pushdown, Skullcrushers, Closegrip benchpress");
                break;
            case "back":
                System.out.println("Deadlift, Rows, Pulldowns");
                break;
            case "legs":
                System.out.println("Squat, Legpress, Lunges, Leg extensions");
                break;
            case "shoulders":
                System.out.println("Militarypress, Lateral raise, Front raise");
                break;
            default:
                System.out.println("Sorry, input didnt find a match in our database, please try again");
        }
        return muscle;
    }
}

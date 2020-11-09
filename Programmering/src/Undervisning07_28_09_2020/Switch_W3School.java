package Undervisning07_28_09_2020;

public class Switch_W3School {
    public static void main(String[] args) {
        switchExample1();
        switchExampleDefault();

    }
    //Method containing switch that finds day
    //1-7 cases with days of the week, day set to 4
    //Outputs: "Thursday"
    static void switchExample1() {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday Suck");
                break;
        }
    }
    //Method containing switch statement with a default case.
    //day set to 4 and used in switch
    //default is run if there is no case match
    //Outputs: "Looking forward to the weekend"
    static void switchExampleDefault(){
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the weekend");
        }
    }
}

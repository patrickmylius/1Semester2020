package Undervisning07_28_09_2020;

public class Ifs_W3School {
    public static void main(String[] args) {
        //Method calls running if, if else and else statements
        example1();
        example2();
        elseExample();
        elseIfExample();
        elseExampleSyntax();



    }
    //Method containing if statements
    //conditions: (if 20 > 18)
    //outputs: "20 is greater than 18"
    static void example1() {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
    }
    //Method containing if statement,
    //Conditions: if x(20) > (y)18
    //Outputs: "x: 20 is greater than y: 18"
    static void example2() {
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x " + x + " is greater than y " + y);
        }
    }
    //Method containing if and else statement
    //Conditions: time(20) < 18 & else
    //outputs: "Good evening"
    static void elseExample() {
        int time = 20;
        if (time < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

    }
    //Method containing if, if else and else statement
    //Conditions: time(22) < 10, time(22) < 20 & else
    //outputs: "Good evening"
    static void elseIfExample() {
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning");
        }
        else if (time < 20) {
            System.out.println("Good day");
        }
        else {
            System.out.println("Good evening");
        }
    }
    //Method containing else statement, same as elseExample() method
    //A more simpler syntax
    //Conditions: time(20) < 18 & else
    //Outputs: "Good evening"
    static void elseExampleSyntax() {
        int time = 20;
        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result);
    }


}

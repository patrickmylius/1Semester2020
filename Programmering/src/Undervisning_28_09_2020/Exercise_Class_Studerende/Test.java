package Undervisning_28_09_2020.Exercise_Class_Studerende;

import Opgave_SmartHomeIde_29_09_2020.Remotes;

public class Test {
    public static void main(String[] args) {
        //Creating 5 person objects
        //Gives them test input
        GroupMember person1 = new GroupMember("Patrick", 26, "Muscle training", "Lasagne");
        GroupMember person2 = new GroupMember("Usamah", 24, "Humanbeings behaviour", "Noobs in league of legends");
        GroupMember person3 = new GroupMember("Daniella", 23, "Jehova", "Pizza");
        GroupMember person4 = new GroupMember("Mikkel", 22, "Gaming", "Italian dishes");
        GroupMember person5 = new GroupMember("Danijel", 22, "Coding", "Burger");

        //Testcase: 1
        //Testinput: "patrick"
        //Expected output: "Patrick", 26, "Muscle training", "Lasagne"
        GroupMember result1 = Function.findUser("patrick");
        testResult(result1, person1);
        //Actual output: "Patrick", 26, "Muscle training", "Lasagne"
        //Testresult: PASS

        //Testcase: 2
        //Testinput: "USAMAH"
        //Expected output: "Usamah", 24, "Humanbeings behaviour", "Noobs in league of legends"
        GroupMember result2 = Function.findUser("USAMAH");
        testResult(result2, person2);
        //Actual output: "Usamah", 24, "Humanbeings behaviour", "Noobs in league of legends"
        //Testresult: PASS

        //Testcase: 3
        //Testinput: "danieLLA"
        //Expected output: "Daniella", 23, "Jehova", "Pizza"
        GroupMember result3 = Function.findUser("danieLLA");
        testResult(result3, person3);
        //Actual output: "Daniella", 23, "Jehova", "Pizza"
        //Testresult: PASS

        //Testcase: 4
        //Testinput: "mIKKEL"
        //Expected output: "Mikkel", 22, "Gaming", "Italian dishes"
        GroupMember result4 = Function.findUser("mIKKEL");
        testResult(result4, person4);
        //Actual output: "Mikkel", 22, "Gaming", "Italian dishes"
        //Testresult: PASS

        //Testcase: 5
        //Testinput: "DaNiJeL"
        //Expected output: "Danijel", 22, "Coding", "Burger"
        GroupMember result5 = Function.findUser("DaNiJeL");
        testResult(result5, person5);
        //Actual output: "Danijel", 22, "Coding", "Burger"
        //Testresult: PASS



    }
    //Method, that holds the compareStrings and compareInts methods below,
    static void testResult(GroupMember result, GroupMember expectedResult) {
        compareStrings(result.name, expectedResult.name);
        compareStrings(result.favoritTopic, expectedResult.favoritTopic);
        compareStrings(result.favoritFood, expectedResult.favoritFood);
        compareInts(result.age, expectedResult.age);
    }

    //Test returns, comparing result.String and espectedResult. String
    static void compareStrings(String result, String expectedResult) {
        if (result.equals(expectedResult)) {
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }

    //Test returns, comparing result.int and expectedResult.int
    static void compareInts(int result, int expectedResult) {
        if (result == (expectedResult)) {
            System.out.println("PASS");
        } else System.out.println("FAIL");
    }
}


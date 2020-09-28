package Undervisning_28_09_2020.Exercise_Class_Studerende;

public class GroupMember extends StudentInfo {
    void introduce() {
        System.out.println("Hi there, i am studying computer science");
    }

    GroupMember() {
        studieRetning = "Computer science";
    }
}

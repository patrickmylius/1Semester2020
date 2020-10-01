package Undervisning7_28_09_2020.Exercise_Class_Studerende;

//GroupMember class, contains generic method for all students and a constructor
public class GroupMember extends StudentInfo {
    //method
    void introduce() {
        System.out.println("Hi there!");
    }

    //constructor
    GroupMember(String navn, int age, String topic, String favoritFood) {
        this.name = navn;
        this.age = age;
        this.favoritTopic = topic;
        this.favoritFood = favoritFood;
        studieRetning = "I study Computer science";
    }
}

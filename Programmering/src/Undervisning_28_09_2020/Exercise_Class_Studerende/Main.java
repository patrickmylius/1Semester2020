package Undervisning_28_09_2020.Exercise_Class_Studerende;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            String memberInput = UserInterface.promptUser();

            GroupMember patrick = new GroupMember();
            patrick.name = "Patrick";
            patrick.age = 26;
            patrick.studieRetning = "Datamatik";
            patrick.favoritTopic = "Muscle training";
            patrick.favoritFood = "Lasagne";

            GroupMember usamah = new GroupMember();
            usamah.name = "Usamah";
            usamah.age = 25;
            usamah.studieRetning = "Datamatik";
            usamah.favoritTopic = "Humanbeings behaviour";
            usamah.favoritFood = "Noobs in league of legends";

            GroupMember daniella = new GroupMember();
            daniella.name = "Daniella";
            daniella.age = 23;
            daniella.studieRetning = "Datamatik";
            daniella.favoritTopic = "Jehova";
            daniella.favoritFood = "Pizza";

            GroupMember mikkel = new GroupMember();
            mikkel.name = "Mikkel";
            mikkel.age = 22;
            mikkel.studieRetning = "Datamatik";
            mikkel.favoritTopic = "Gaming";
            mikkel.favoritFood = "Italian dishes";

            GroupMember danijel = new GroupMember();
            danijel.name = "Danijel";
            danijel.age = 22;
            danijel.studieRetning = "Datamatik";
            danijel.favoritTopic = "Coding";
            danijel.favoritFood = "Burger";

            switch (memberInput.toLowerCase()) {
                case "patrick":
                    patrick.introduce();
                    System.out.println("My name is " + patrick.name);
                    System.out.println("I am " + patrick.age + " years old");
                    break;
                case "usamah":
                    usamah.introduce();
                    System.out.println("My name is " + usamah.name);
                    System.out.println("I am " + usamah.age + " years old");
                    break;
                case "daniella":
                    daniella.introduce();
                    System.out.println("My name is " + daniella.name);
                    System.out.println("I am " + daniella.age + " years old");
                    break;
                case "mikkel":
                    mikkel.introduce();
                    System.out.println("My name is " + mikkel.name);
                    System.out.println("I am " + mikkel.age + " years old");
                    break;
                case "danijel":
                    danijel.introduce();
                    System.out.println("My name is " + danijel.name);
                    System.out.println("I am " + danijel.age + " years old");
                    break;
                default:
                    System.out.println("Sorry, no group member of Copy paste, matching your input");

            }

        }
    }
}

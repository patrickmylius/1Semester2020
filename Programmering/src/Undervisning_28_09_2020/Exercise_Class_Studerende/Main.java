package Undervisning_28_09_2020.Exercise_Class_Studerende;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            String memberInput = UserInterface.promptUser();

            Patrick memb1 = new Patrick();
            memb1.name = "Patrick";
            memb1.age = 26;
            memb1.favoritTopic = "Muscle training";
            memb1.favoritFood = "Lasagne";

            Usamah memb2 = new Usamah();
            memb2.name = "Usamah";
            memb2.age = 25;
            memb2.favoritTopic = "Humanbeings behaviour";
            memb2.favoritFood = "Noobs in league of legends";

            Daniella memb3 = new Daniella();
            memb3.name = "Daniella";
            memb3.age = 23;
            memb3.favoritTopic = "Jehova";
            memb3.favoritFood = "Pizza";

            Mikkel memb4 = new Mikkel();
            memb4.name = "Mikkel";
            memb4.age = 22;
            memb4.favoritTopic = "Gaming";
            memb4.favoritFood = "Italian dishes";

            Danijel memb5 = new Danijel();
            memb5.name = "Danijel";
            memb5.age = 22;
            memb5.favoritTopic = "Coding";
            memb5.favoritFood = "Burger";

            switch (memberInput.toLowerCase()) {
                case "patrick":
                    memb1.introduce();
                    System.out.println("I am " + memb1.age + " years old");
                    break;
                case "usamah":
                    memb2.introduce();
                    System.out.println("I am " + memb2.age + " years old");
                    break;
                case "daniella":
                    memb3.introduce();
                    System.out.println("I am " + memb3.age + " years old");
                    break;
                case "mikkel":
                    memb4.introduce();
                    System.out.println("I am " + memb4.age + " years old");
                    break;
                case "danijel":
                    memb5.introduce();
                    System.out.println("I am " + memb5.age + " years old");
                    break;
                default:
                    System.out.println("Sorry, no group member of Copy paste, matching your input");

            }

        }
    }
}

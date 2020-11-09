package Undervisning02_11_09_2020;

public class Welcome {
    public static void main(String[] args) {
        //Display message Welcome to Java! on the console
        System.out.println("Welcome to Java!");
        System.out.println("");
        hej();
        hejMednavne("Andracs");
        hejMednavne("Usamah");
        hejMednavne("Daniella");
        hejMednavne("Danijel");
        hejMednavne("Bobski mobski, badowski");
        System.out.println("");
        System.out.println("");
        farvel("Andracs");
        farvel("Usamah");
        farvel("Daniella");
        farvel("Danijel");
        farvel("Bobski mobski, badowski");
        //3 Nedeståënde er metoder. hej() tager ingen parametre, farvel() og hejMedNavne() ønsker et navn som parametre.
    }
    public static void hej(){
        System.out.println("Hej allesammen");
    }
    public static void farvel(String navn){
        System.out.println("Farvel igen " + " " + navn);
    }
    public static void hejMednavne(String navn){
        System.out.println("Hej" + " " + navn);
    }
}

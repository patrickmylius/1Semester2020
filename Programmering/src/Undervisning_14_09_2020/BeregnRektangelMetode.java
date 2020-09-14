package Undervisning_14_09_2020;

public class BeregnRektangelMetode {
    public static void main(String[] args) {
        //Souts resultat af metodebrug, med længde 2 og bredde 5
        System.out.println(beregnRektangel(2, 5));
        //Souts resultat af metodebrug, med længde 6 og bredde 12
        System.out.println(beregnRektangel(6, 12));
    }

    //metode som tager i mod int længde og int bredde
    public static int beregnRektangel(int length, int bredde) {
        //computes area
        int area = length * bredde;
        //metoden returnere det udregnede area
        return area;
    }
}

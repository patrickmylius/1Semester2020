package Undervisning_14_09_2020;

public class ComputeAreaWithMethod {
    public static void main(String[] args) {
        //Souts metoden med given input 2, 5 , 10.
        System.out.println("Arealet for radius 2 er " + beregnAreal(2));
        System.out.println("Arealet for radius 5 er " + beregnAreal(5));
        System.out.println("Arealet for radius 10 er " + beregnAreal(10));

        double toCirkler = beregnAreal(5) + beregnAreal(10);
        System.out.println("Summen af arealet af to cirkler :" + toCirkler);
    }
    //Beregn areal metoden.
    public static double beregnAreal(double radius) {
        double areal = radius * radius * 3.14;
        return areal;
    }
}

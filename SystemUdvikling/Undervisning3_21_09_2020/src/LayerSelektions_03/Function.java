package LayerSelektions_03;

public class Function {
    //method
    static String sammenLign(int first, int second) {
        //sets values + string to String out1 and out2.
        String out1 = "first variable is higher than the second variable";
        String out2 = "second variable is higher than the first variable";

        //run the 2 values given, through if selections, to find the highest value.
        //If first value are highest, return out1.
        //If second value are highest, return out2.
        if (first > second) {
            return out1;
        } else return out2;
    }
}
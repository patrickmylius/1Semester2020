package LayerSelektions_04;

public class Function {
    //method
    static String valueCheck(double first, double second, double third) {
        //sets values + string to String out1, out2 and out3
        String out1 = first + " is the highest value";
        String out2 = second + " is the highest value";
        String out3 = third + " is the highest value";

        //run 3 values given, through if selections, to find the highest value.
        //If first value are highest, return out1
        if (first > second && first > third) {
            return out1;
        }
        //If second value are highest, return out2
        else if (second > first && second > third) {
            return out2;
        }
        //If third value are highest, return out3
        else return out3;
    }
}

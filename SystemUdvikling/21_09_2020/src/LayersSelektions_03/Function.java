package LayersSelektions_03;

public class Function {


    static String sammenLign(int first, int second) {
        String out1 = "first variable is higher than the second variable";
        String out2 = "second variable is higher than the first variable";
        String out3 = "first and second variable are equals";

        if (first > second) {
            return out1;
        }
        else if (first < second) {
            return out2;
        }
        else  {
            return out3;
        }
    }
}
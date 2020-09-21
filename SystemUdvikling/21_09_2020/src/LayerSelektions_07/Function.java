package LayerSelektions_07;

public class Function {

    static String compute(int x, int y) {
        //Declare string out1 and out2, consist of string and ints
        String out1 = "Der er " + (x - y) + " i mellem" + " X:" + x + " og " + "Y:" + y;
        String out2 = "Der er ikke 10 i mellem X:" + x + " og " + "Y:" + y;

        //check x and y, through if selections, to find the difference between them.
        //If value between x and y are higher than 10: return out1, else return out2
        if (x - y >= 10 || x - y <= -10) {
            return out1;
        } else {
            return out2;
        }
    }
}

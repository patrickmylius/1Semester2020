package Undervisning5_18_09_2020;

public class Note_Om_TypeCasting {

    public static void main(String[] args) {
        int myInt = 20;//declares int myInt
        double myDouble = myInt; // converts, int to double

        System.out.println(myInt);      // Outputs 20
        System.out.println(myDouble);   // Outputs 20.0

        //declares num int
        int num = 10;
        System.out.println("The integer value: " + num); //souter 10

        //converts int to double
        double data = num;
        System.out.println("The double value: " + data); //souter 10.0


        int num1 = 10;//declares num1 int
        System.out.println("The integer value is: " + num);

        // converts int to string type
        String data1 = String.valueOf(num);
        System.out.println("The string value is: " + data);

        //declares string data2
        String data2 = "10";
        System.out.println("The string value is: " + data);

        // convert string variable to int
        int num2 = Integer.parseInt(data2);
        System.out.println("The integer value is: " + num2);
    }
}


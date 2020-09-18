package Miniprojekt_En_MiniComputer;
//Kaldt ved input 8
import java.util.Scanner;
//Patrick
public class BMI {
    public static void beregnBMI() {
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);

            //souts user to input weight and height in pounds
            System.out.print("Enter weight in pounds: ");
            double pounds = input.nextDouble();
            System.out.print("Enter height in inches: ");
            double inches = input.nextDouble();
            //sets value of kilograms and meters
            double kilograms = pounds * 0.45359237;
            double meters = inches * 0.0254;
            //computes BMI with
            double BMI = kilograms / Math.pow(meters, 2);
            //souts answer
            System.out.println(BMI);
        }
    }
}

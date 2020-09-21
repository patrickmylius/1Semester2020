import java.util.Scanner;
//Not correct yet
public class Challenge_379 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double income;
        double taxRate;

        System.out.println("Input income: ");
        income = input.nextDouble();

        if (income > 0 && income < 10000 ) {
            taxRate = 0;
            double totalTax = income * taxRate;
            System.out.println("Tax amount is: " + totalTax + " of income: " + income);
        }
        else if (income >= 10000 && income < 30000){
            taxRate = 0.10;
            double totalTax = income * taxRate;
            System.out.println("Tax amount is: " + totalTax + " of income: " + income);
        }
        else if (income >= 30000 && income < 100000){
            taxRate = 0.25;
            double totalTax = income * taxRate;
            System.out.println("Tax amount is: " + totalTax + " of income: " + income);
        }
        else if (income >= 100000) {
            taxRate = 0.40;
            double totalTax = income * taxRate;
            System.out.println("Tax amount is: " + totalTax + " of income: " + income);
        } else
            System.out.println("Wrong input, try again: ");


    }
}

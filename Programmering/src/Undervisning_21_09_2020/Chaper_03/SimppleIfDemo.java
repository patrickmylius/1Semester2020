package Undervisning_21_09_2020.Chaper_03;

import java.util.Scanner;
//Programmet beder om bruger input af typen int
//programmet bruger modules til at se om number / 5 har en rest == 0
//programer bruger modules til at se om number / 2 har en rest ==0.
public class SimppleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number % 5 == 0)
            System.out.println("HiFive");

        if (number % 2 == 0)
            System.out.println("HiEven");
    }
}

package Miniprojekt_En_MiniComputer;

import java.util.Random;
import java.util.Scanner;
//Kaldt ved input = 5
public class LotteryGame {
    //Lavet af Usamah
    public static void spil() {
        for (int i = 0; i < 3; i++) {


            Scanner inputObject = new Scanner(System.in);
            Random randomObject = new Random();

            System.out.println(" Vælg nummer ");
            int number = inputObject.nextInt();

            int randomNumber = randomObject.nextInt(10);

            if (randomNumber == number)
                System.out.println(" Tillykke du vandt");
            else
                System.out.println("Desværre du tabte ");
        }
    }
}
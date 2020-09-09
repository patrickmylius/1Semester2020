package Undervisning_07_09_2020;
import java.util.Scanner;

public class HelloWorld {
    static String name;

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello Mom");
        System.out.println(5 + 5);

        Scanner input = new Scanner(System.in);
        System.out.println("Hi, whats your name: ");
        name = input.nextLine();

        System.out.println("Hi " + name + " my name is Siri");
    }
}
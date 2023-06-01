package lesson04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a nuber: ");

        while ((inputNumber=scanner.nextInt()) != 0){
            // If result equal 0 ---> Even, otherwise we will have an ood
            System.out.printf("You have just input the number: %d%n", inputNumber);
            System.out.println("Please enter a number: ");
        }

        System.out.println("After While...Loop");
        System.out.println(inputNumber);
    }
}

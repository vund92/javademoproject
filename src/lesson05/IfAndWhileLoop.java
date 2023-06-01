package lesson05;

import java.util.Scanner;

public class IfAndWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        System.out.println("Please enter a number: \n");
        while ((userInput = scanner.nextInt())!=0){
            if(userInput%2 == 0){
                System.out.println("You have just input an even number! \n");
            }else{
                System.out.println("You have just input an odd number");
            }

            System.out.println("Please enter a number: \n");
        }
    }
}

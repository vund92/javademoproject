package lesson06;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputColor;
        System.out.println("Please enter a color as string: \n");
        inputColor = scanner.next();

        switch (inputColor){
            case "red":
                System.out.println("Put this ball into red basket.\n");
                break;
            case "green":
                System.out.println("Put this ball into green basket.\n");
                break;
            default:
                System.out.println("Ok, let put this strange ball into black basket!\n");
        }
    }
}

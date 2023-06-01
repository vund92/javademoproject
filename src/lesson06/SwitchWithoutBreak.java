package lesson06;

import java.util.Scanner;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDay;
        System.out.println("Please enter a day: \n");
        inputDay = scanner.next();

        switch (inputDay){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("It's a weekday.");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Happy weekend!");
                break;
            default:
                System.out.println("Wrong input!");
        }

//        if((inputDay == "Monday") ||
//                (inputDay == "Tuesday") ||
//                (inputDay == "Wednesday") ||
//                (inputDay == "Thursday") ||
//                (inputDay == "Friday")
//        ){
//            System.out.println("It's a weekday.");
//        } else if ((inputDay == "Saturday") || (inputDay == "Sunday")) {
//            System.out.println("Happy weekend!");
//        } else System.out.println("Wrong input");

        if(inputDay.equals("Monday") ||
                inputDay.equals("Tuesday") ||
                inputDay.equals("Wednesday") ||
                inputDay.equals("Thursday") ||
                inputDay.equals("Friday")
        ){
            System.out.println("It's a weekday.");
        } else if (inputDay.equals("Saturday") || inputDay.equals("Sunday")) {
            System.out.println("Happy weekend!");
        } else System.out.println("Wrong input");
    }
}

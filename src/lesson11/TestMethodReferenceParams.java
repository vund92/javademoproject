package lesson11;

import java.util.Scanner;

public class TestMethodReferenceParams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you wanna see a robot cat or robot dog");

        String robotName = scanner.next();
        TestMethodReferenceParams testMethod = new TestMethodReferenceParams();

        switch (robotName){
            case "cat":
                testMethod.triggerHelloGreetingsForCat(new RobotCat());
                break;
            case "dog":
                testMethod.triggerHelloGreetingsForDog(new RobotDog());
                break;
            default:
                System.out.println("The robot type is incorrect!");
        }
    }

    public void triggerHelloGreetingsForCat(RobotCat robotCat){
        robotCat.sayHello();
    }

    public void triggerHelloGreetingsForDog(RobotDog robotDog){
        robotDog.sayHello();
    }
}

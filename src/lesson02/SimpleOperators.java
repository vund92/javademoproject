package lesson02;

import java.sql.SQLOutput;

public class SimpleOperators {
    public static void main(String[] args) {
        int myAge = 18;
        myAge = myAge + 1;
        System.out.println(myAge);
        myAge++;
        System.out.println(myAge);

        boolean isThatTrue = myAge >= 20;
        System.out.println(isThatTrue);

        boolean logicalOperatorAND = myAge > 16 && myAge < 30;
        boolean logicalOperatorOR = myAge > 16 || myAge > 1000 || myAge > 100;
        System.out.println(logicalOperatorAND);
        System.out.println(logicalOperatorOR);
    }
}

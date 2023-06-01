package lesson07;

import java.util.Arrays;

public class ArrayLearning {
    public static void main(String[] args) {
        int [] firstArray;
        int secondArray [];

        int [] thirdArray = new int [3];
        int fourthArray [] =  new int [3];

        int [] fifthArray = new int[] {1, 2, 3};
        int sixthArray [] = {1, 2, 7, 9, 5, 6};

        int secondElementFromArray = sixthArray[1];
        System.out.println(secondElementFromArray);

        sixthArray[1] = 6;
        secondElementFromArray = sixthArray[1];
        System.out.println(secondElementFromArray);

        for (int elementIndex = sixthArray.length - 1; elementIndex >= 0; elementIndex--) {
            System.out.printf("The element values is %d.%n", sixthArray[elementIndex]);
        }

        for (int elementIndex = sixthArray.length - 1; elementIndex >= 0; elementIndex--) {
            if(sixthArray[elementIndex]%2 == 0){
                System.out.printf("We had %d as an even number.%n", sixthArray[elementIndex]);
            }
        }

        Arrays.sort(sixthArray);
        System.out.println("AFTER SORTING ASCENDING");
        for (int elementIndex = 0; elementIndex < sixthArray.length; elementIndex++) {
            System.out.printf("The element values is %d.%n", sixthArray[elementIndex]);
        }
    }
}

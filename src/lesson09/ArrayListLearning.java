package lesson09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        //1. Declare an ArrayList normal way and using asList to convert and create
        List<Integer> myNumList = new ArrayList<Integer>();
        List<String> myStringList = new ArrayList<String>();

        Float [] floatNumArray = {1.1F, 2.2F, 3.3F};
        List<Float> floatNumList = Arrays.asList(floatNumArray);

        //2. Add, Insert, Edit, Delete element in ArrayList
        SecureRandom secureRandom = new SecureRandom();
        for(int i = 0; i<10; i++){
            myNumList.add(secureRandom.nextInt());
        }
        System.out.println("\n");

        //3. Iterating ArrayList, normal for and for-each loop
        for (int i = 0; i < myNumList.size(); i++) {
            System.out.println(myNumList.get(i));
        }
        System.out.println("\n");

        // Insert then Iterating by normal for
        myNumList.add(1,100);
        for (int i = 0; i < myNumList.size(); i++) {
            System.out.println(myNumList.get(i));
        }
        System.out.println("\n");

        // Iterating by ForEach
        for(int i : myNumList){
            System.out.println(i);
        }
        System.out.println("\n");

        //4. Check size, isEmpty...
        System.out.println("is myNumList empty: " + myNumList.isEmpty());
        System.out.println("is myStringList empty: " + myStringList.isEmpty());
        System.out.println("\n");

        myNumList.remove(0);
        myNumList.add(0,10);

        for(int i : myNumList){
            System.out.println(i);
        }

        //5. Small example with SecureRandom


    }
}

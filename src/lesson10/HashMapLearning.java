package lesson10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        //1. Declare HashMap
        Map<Integer, String> myStudentList = new HashMap<>();
        //2. CRUD - Create, Read, Update, Delete (DB-like context)
        myStudentList.put(111, "Student A");
        myStudentList.put(112, "Student B");
        myStudentList.put(112, "Student C");
        System.out.println("Student Name with Id 112 is: " + myStudentList.get(112));

        myStudentList.replace(111, "Student 01");
        System.out.println("Student Name with Id 111 is: " + myStudentList.get(111));
        System.out.println("Hashmap size before removing: " + myStudentList.size());

        myStudentList.remove(111);
        System.out.println("Hashmap size after removing: " + myStudentList.size());

        System.out.println("is 111 key existing: " + myStudentList.containsKey(111));

        //3. Iterating a hashmap
        //4. What if you put same key!?
        //5. Get all keys
        Set<Integer> allStudentIds = myStudentList.keySet();
        for(int studentId : allStudentIds){
            System.out.println(studentId);
        }

        //6. Get all values
        Collection allStudentNames = myStudentList.values();
        for(Object name : allStudentNames){
            System.out.println(name);
        }

    }
}

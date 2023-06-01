package lesson10;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning_Nested {
    public static void main(String[] args) {
        Map<Integer, String> myStudentList = new HashMap<>();
        myStudentList.put(111, "Student A");
        myStudentList.put(112, "Student B");

        //111: <String, String> | name, age

        Map<Integer, Map<String, String>> complexStudentList = new HashMap<>();
        Map<String, String> student1 = new HashMap<>();
        Map<String, String> student2 = new HashMap<>();

        student1.put("name", "Student A");
        student1.put("address", "Address A");

        student2.put("name", "Student B");
        student2.put("address", "Address B");

        complexStudentList.put(111, student1);
        complexStudentList.put(112, student2);

        String student1Name = complexStudentList.get(111).get("name");
        String student1Address =complexStudentList.get(111).get("address");

        System.out.println(student1Name);
        System.out.println(student1Address);

        complexStudentList.forEach((key, value) -> {
            System.out.println(complexStudentList.get(key).get("name"));
            System.out.println(complexStudentList.get(key).get("address"));
        });
    }
}

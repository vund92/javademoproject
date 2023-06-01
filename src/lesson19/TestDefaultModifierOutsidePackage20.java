package lesson19;

import lesson20.Human;

public class TestDefaultModifierOutsidePackage20 {

    public static void main(String[] args) {
        Human human = new Human("XYZ", 23);
        //human.age = 45; //even imported from lesson20.Human, but it not in the same package and it is of no modifier.
    }
}

package lesson02;

public class VariableExploring {
    public static void main(String[] args) {
        int myAge = 18;
        boolean isThatTrue = false;
        float f = 1.234F;
        double d = 2.345;
        char c;
        c = 'c'; // not "c" because it is a string when we use double quotes ""

        System.out.println("myAge");
        System.out.println(isThatTrue);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);

        String myName = "Tu Huynh";
        myAge = 18;
        System.out.printf("My name is %s and I'm %d years old.%n", myName, myAge);
    }
}

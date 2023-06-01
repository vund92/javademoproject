package lesson16;

public class PersonReadOnly {
    private String name;
    private int age;

    public PersonReadOnly(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        PersonReadOnly personReadOnly = new PersonReadOnly("Bob", 18);
        int age = personReadOnly.getAge();
        String name = personReadOnly.getName();
        System.out.println(age);
        System.out.println(name);
    }
}

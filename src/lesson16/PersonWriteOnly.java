package lesson16;

public class PersonWriteOnly {
    private String name;
    private int age;

    public PersonWriteOnly(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        PersonWriteOnly personWriteOnly = new PersonWriteOnly("Bob", 18);
        personWriteOnly.setAge(19);
        personWriteOnly.setName("New Bob");
        System.out.println(personWriteOnly.age + " = " + personWriteOnly.name);
    }
}

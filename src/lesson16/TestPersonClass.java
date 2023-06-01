package lesson16;

public class TestPersonClass {
    public static void main(String[] args) {
        Person bob = new Person();
        bob.setName("Bob");
        bob.setAge(18);

        Person teo = new Person();
        teo.setAge(-18);
        teo.setName("Teo");

        System.out.println(teo.getAge()); // throw error xong thi dung ctr ko chay nhung dong sau đó

        System.out.println(bob.getAge());


        System.out.println("End of program!");
    }
}

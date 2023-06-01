package lesson18;

public class Dog extends Animals {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Wolf wolf...");
        System.out.println("I'm "+this.getName());
    }
}

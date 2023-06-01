package lesson18;

public class Animals {

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Animals(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void makeSound(){
        System.out.println("Parent - Making sound...");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

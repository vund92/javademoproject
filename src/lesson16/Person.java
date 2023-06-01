package lesson16;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("Invalid age argument");
            return;
        }
        this.age = age;
    }

    public int getAge(){
        if(age == 0){
            throw new Error("It seems " + this.name + " was not set age yet!");
        }
        return age;
    }
}

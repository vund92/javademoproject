package lesson20;

public class SuperMan extends Human {

    public SuperMan(String name, int age) {
        super(name, age);
    }

    public void doSomething() {
        //super.age = 30;
    }

    public void adjustParentAge(int newAge){
        super.age = newAge;
    }

    public static void main(String[] args) {
        SuperMan superMan = new SuperMan("Batman", 18);
        superMan.adjustParentAge(20);
        System.out.println(superMan.getAge());
    }
}

package lesson18;

public class Cat extends Animals {
    public Cat(String name, String color){
        super(name, color);
    }



    //Method Overloading already we learned

    // Now we'll learn Method Overriding

    @Override
    public void makeSound() {
        System.out.println("Meow meow..."); //super co khai bao truoc hoặc sau 1 câu lenh khac - chỉ khi lop nay extend một normal class ko phải abstract class
        super.makeSound(); //ke thua lai những cái có trong method makeSound của parent class - có thể ko kế thừa lại hàm cũ mà xoa dong nay di cung duoc
    }

    //Overloading
    public void makeSound(String string) {
        super.makeSound();
        System.out.println(string);
    }

    public void dummyMethod(){
        System.out.println("This is a dummy method.");
    }

    public static void main(String[] args) {
        Animals cat = new Cat("Cat01", "black");
        //Cat cat = new Cat("Cat01", "black");
        cat.makeSound();
        //cat.makeSound("aloha");
        System.out.println(cat.toString());
        //cat.dummyMethod();

        Dog dog = new Dog("Dog01", "black");
        dog.makeSound(); //nó sẽ kiểm tra trong Dog class có method makeSound nào được override ko thì nó lấy cái đó,
        // còn nếu không có thì nó sẽ gọi makeSound của Parent class.
        //dog.dummyMethod(); //Dog class doesn't have this method, and parent class neither.
    }
}

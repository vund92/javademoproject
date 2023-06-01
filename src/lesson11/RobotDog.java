package lesson11;

public class RobotDog {
    public void run(){
        System.out.println("I'm running...");
    }

    public void sayHello(){
        System.out.println("Hello, I'm a robot dog.\n" + "Nice to meet you.");
    }

    public void sayHelloWithName(String name){
        System.out.println("Hello, I'm a robot dog.\n" + "Nice to meet you, " + name + ".");
    }

    //Method overloading
    public void sayHello(String name){
        System.out.println("Hello, I'm a robot dog.\n" + "Nice to meet you, " + name + ".");
    }

//    public int sayHello(String name){
//        System.out.println("Hello, I'm a robot dog.\n" + "Nice to meet you, " + name + ".");
//        return 1;
//    } //==> cannot have same method name with same parameters even though having different method datatype (ex: void >< int)

    public void sayHello(int timeToSayHello){
        for(int time = 0; time < timeToSayHello; time++){
            System.out.println("Woof");
        }
    }
    public static void main(String[] args) {
        RobotDog robotDog = new RobotDog();
        robotDog.sayHello();
        robotDog.sayHelloWithName("Vu");
        robotDog.sayHello("Lan");
        robotDog.sayHello(3);
    }
}

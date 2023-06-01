package Draft;

public class Test {

    class Vehicle {
        Vehicle() {
            System.out.println("Vehicle is created");
        }
    }

    public class Bike6 extends Vehicle {
        int speed;

        Bike6(int speed) {
            this.speed = speed;
            System.out.println(speed);
        }
    }

    public static void main(String args[]) {
        Test test = new Test();
        Test.Bike6 b = test.new Bike6(10);
    }
}

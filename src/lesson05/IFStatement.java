package lesson05;

public class IFStatement {
    public static void main(String[] args) {
        int temperature = -1;
        int depositMoney = 10;

        if(temperature < 0){
            System.out.println("So cold");
        }

        if(depositMoney > 0){
            for(int remainingMoney = depositMoney; remainingMoney > 0 ; remainingMoney--){
                System.out.printf("Push up the %d times%n", depositMoney-remainingMoney+1);
            }
        }

        System.out.println("Outside");
    }
}

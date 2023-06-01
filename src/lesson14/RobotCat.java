package lesson14;

public class RobotCat {
    private String name;
    private String color;

//    public RobotCat() {
//    }

    public RobotCat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //==> Note: neu delcare 1 constructor voi params thi default constructor se khong ton tai tu dong nua,
    // neu muon dung default constructor thi phai khai bao no bang tay tuong minh lai

    public RobotCat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
//        RobotCat defaultRobotCat = new RobotCat();
        RobotCat robotCatWithNameAndColor = new RobotCat("Meomeo", "Black");
        RobotCat robotCatWithName = new RobotCat("Haha");

//        System.out.println(defaultRobotCat.getColor());
//        System.out.println(defaultRobotCat.getName());

        System.out.println(robotCatWithNameAndColor.getColor());
        System.out.println(robotCatWithNameAndColor.getName());

        System.out.println(robotCatWithName.getColor());
        System.out.println(robotCatWithName.getName());
    }
}

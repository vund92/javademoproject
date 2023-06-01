package lesson11;

import java.util.Date;

public class TestRobotCat {
    public static void main(String[] args) {
        RobotCat robotCat = new RobotCat();
        robotCat.run();
        String catName = robotCat.catName();
        System.out.println(catName);

        robotCat.setId("111");
        robotCat.setDate(new Date().toString());

        String robotCatId = robotCat.getId();
        String robotCatDate = robotCat.getDate();

        System.out.println(robotCatId);
        System.out.println(robotCatDate);
    }
}

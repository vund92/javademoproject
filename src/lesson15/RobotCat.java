package lesson15;

public class RobotCat {
    private int id;
    private String name;
    private static int numOfCats = 0;

    public RobotCat(){

    }

    public RobotCat(String name){
        id = ++numOfCats;
        this.name = name;
    }

    public RobotCat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumOfCats(){
        numOfCats++;
        return numOfCats;
    }

    public static void main(String[] args) {
        //RobotCat.numOfCats = 10; //da reassign lai nen numOfCats = 10, luc nay neu khai bao instance thi numOfCats se tang tu 10
        RobotCat cat1 = new RobotCat("cat01");
        RobotCat.numOfCats = 10;
        //cat1.numOfCats = 10; //co the dung cach nay nhung no se lam nguoi ta doc vao confused.
        // Tot nhat van nen dung RobotCat.numOfCats boi vi numOfCats la member cua Class RobotCat
        RobotCat cat2 = new RobotCat("cat02");

        System.out.println(cat1.getId()); //1
        System.out.println(cat2.getId()); //11
        System.out.println(RobotCat.getNumOfCats()); //12
    }
}

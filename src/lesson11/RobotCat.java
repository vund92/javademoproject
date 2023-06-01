package lesson11;

public class RobotCat {

    private String id;
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void run(){
        System.out.println("The cat is running...");
    }

    public String catName(){
        return "Doreamon";
    }

    public void sayHello(){
        System.out.println("Hello, I'm a robot cat.\n" + "Nice to meet you.");
    }

}

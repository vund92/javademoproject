package lesson21;

public class FullTimeEmployee extends Employee implements Insurance, Bonus {

    static final double RATE = 50.0;

    private double salary;

    public FullTimeEmployee(String name, String id) {
        super(name, id);
        //System.out.println("Doi voi mot class khi extends mot Abstract Class ");
        //System.out.println("Để truy cập hàm tạo của lớp cha, chúng ta sử dụng super () bên trong hàm tạo của Lớp con. " +
        //        "Lưu ý rằng câu lệnh super phải luôn là câu lệnh đầu tiên của hàm tạo của lớp con." +
        //        "Con ơ class bình thương thì super() nằm truoc hay sau lenh nao cung duoc");

    }

    @Override
    public double calculateBiWeeklySalary() {
        double salary =  FTE_SALARY_FACTOR * RATE * 100;
        this.salary = salary;
        return this.salary + this.getInsurance() + getBonus();
    }

    @Override
    public String toString() {
        return super.toString() + ", and this is a FTE with Salary: " + this.salary;
    }

    @Override
    public double getInsurance() {
        return 50;
    }

    @Override
    public double getBonus() {
        return 100;
    }
}

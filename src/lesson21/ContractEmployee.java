package lesson21;

public class ContractEmployee extends Employee {

    static final double RATE = 40.0;

    private double salary;

    public ContractEmployee(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateBiWeeklySalary() {
        double salary =  CONTRACT_EMP_SALARY_FACTOR * RATE * 80;
        this.salary = salary;
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", and this is a FTE with Salary: " + this.salary;
    }

}

package lesson21;
//Object abstraction - a general idea about a type of situation, thing, or person rather than a specific example from real life
public abstract class Employee {

    protected static final double FTE_SALARY_FACTOR = 1.0;
    protected static final double CONTRACT_EMP_SALARY_FACTOR = 0.8;
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateBiWeeklySalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

package lesson21;

public class TestEmployee {
    public static void main(String[] args) {
        //Employee fte = new FullTimeEmployee("John", "111"); //cai nay van duoc
        FullTimeEmployee fte = new FullTimeEmployee("John", "111");
        fte.calculateBiWeeklySalary();
        System.out.println(fte);

        //Employee contractEmp = new ContractEmployee("Tu", "222"); //cai nay van duoc
        ContractEmployee contractEmp = new ContractEmployee("Tu", "222");
        contractEmp.calculateBiWeeklySalary();
        System.out.println(contractEmp);

        //Employee emp = new Employee("Vu", "123");
    }
}

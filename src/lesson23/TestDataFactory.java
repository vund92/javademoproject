package lesson23;

import java.util.ArrayList;
import java.util.List;

public class TestDataFactory {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        Customer cus1 = new Customer("William", 111);
        Customer cus2 = new Customer("Micheal", 112);
        customers.add(cus1);
        customers.add(cus2);

        String path = "E:\\text.txt";

        boolean isSavingSuccessfully = DataFactory.saveCustomerList(customers, path);
        System.out.println(isSavingSuccessfully);

        List<Customer> readCustomers = DataFactory.readCustomerList(path);
        System.out.println("Name\tID");
        for(Customer customer : readCustomers){
            System.out.println(customer.getName() + "\t" + customer.getId());
        }
    }
}

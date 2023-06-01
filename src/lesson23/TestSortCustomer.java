package lesson23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestSortCustomer {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer cus1 = new Customer("ZZZ", 111);
        Customer cus2 = new Customer("AAA", 112);
        Customer cus3 = new Customer("BBB", 113);
        customerList.add(cus1);
        customerList.add(cus2);
        customerList.add(cus3);

        System.out.println("BEFORE sorting the customer list");
        for(Customer customer : customerList){
            System.out.println(customer); //boi vi cho nay dang print 1 instance chu ko phai print 1 attribute nen o ben class Customer phai override toString()
            // khi da override toString() thi khi print 1 instance no se tu dong trigger toString()

            // boi vi class Customer da override toString(),
            // nen cho nay khi sout 1 customer thi no se in ra ngoai theo format trong toString(). Vi du: Customer{name='ZZZ', id=111}
            //con neu class Customer ko override toString(),
            // thi cho nay se in ra ngoai cai dia chi cua customer trong Java Heap. Vi du: lesson23.Customer@7b23ec81

        }

        Collections.sort(customerList); //khi goi Collections.sort thi nó sẽ kiểm tra xem customerList (phai la List) này
        // chua nhung phan tu thuoc 1 class mà có implements Comparable<Customer> hay khong.
        // Luu y: Comparable<ten class> nghia la thong bao class do có kha nang compare
        // Tiep nua, Collections.sort sẽ tu dong kiểm tra và trigger cái hàm compareTo() đa duoc override lại trong class đó.
        // Đây là cach no lam viec >>>>>>>>>>>>>>> phuc tap vai

        System.out.println("AFTER sorting the customer list");
        for(Customer customer : customerList){
            System.out.println(customer);
        }
    }
}

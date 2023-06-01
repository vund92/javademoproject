package lesson23;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public  static boolean saveCustomerList(List<Customer> customers, String path){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            for(Customer customer : customers){
                String dataLine = customer.getName() + "; " + customer.getId();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();

            return true;
        } catch (Exception exception){
            exception.printStackTrace();
        }

        return false;
    }

    public static List<Customer> readCustomerList(String path){
        List<Customer> customers = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String dataLine = bufferedReader.readLine();
            while (dataLine !=null){
                String [] cusData = dataLine.split("; ");
                String cusName = cusData[0];
                int cusId = Integer.parseInt(cusData[1]);
                customers.add(new Customer(cusName, cusId));
                dataLine = bufferedReader.readLine();
            }

            fileInputStream.close();
            inputStreamReader.close();
            bufferedReader.close();

        } catch (Exception exception){
            exception.printStackTrace();
        }

        return customers;
    }
}

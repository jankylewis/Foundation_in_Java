package ProgramEngineering.ComparableInterfaceNFileManipulation;

import java.io.*;
import java.util.ArrayList;

public class DataFactory {

    public static boolean saveCustomerList(ArrayList<Customer> customerList, String path) {
        try {
//            FileOutputStream is an output stream used for WRITING data to a file
            FileOutputStream fileOutputStream = new FileOutputStream(path);
//            OutputStreamWrite converts character stream to byte stream
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
//            BufferedWriter class provides buffering for Writer (namely OutputStreamWriter) instances ->
//            ACCELERATE PERFORMANCE since it inherits Writer class
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            for (Customer customer : customerList) {
                String dataLine = "" + customer.getName() + ";" + "" + customer.getId();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public static ArrayList<Customer> readCustomerList(String path) {
        ArrayList<Customer> customerList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] customerData = dataLine.split(";");
                String customerName = customerData[0];
                int customerId = Integer.parseInt(customerData[1]);
                customerList.add(new Customer(customerName, customerId));
                dataLine = bufferedReader.readLine();
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return customerList;
    }
}

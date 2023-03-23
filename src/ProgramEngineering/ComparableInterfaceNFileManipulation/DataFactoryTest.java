package ProgramEngineering.ComparableInterfaceNFileManipulation;

import java.util.ArrayList;

public class DataFactoryTest {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        Customer firstCus = new Customer("Rectangle", 30);
        Customer secondCus = new Customer("Relms", 20);
        Customer thirdCus = new Customer("Julian", 12);
        Customer fourthCus = new Customer("Geogre", 30);
        Customer fifthCus = new Customer("Edward", 8);
        Customer sixthCus = new Customer("Ashley", 22);
        customerList.add(firstCus);
        customerList.add(secondCus);
        customerList.add(thirdCus);
        customerList.add(fourthCus);
        customerList.add(fifthCus);
        customerList.add(sixthCus);

        String path = "/Users/vinhtran02092k/Desktop/Materials/Job_Applying/Java_revision/Java_Revision/customer_data.txt";

        boolean isSavedSuccessfully = DataFactory.saveCustomerList(customerList, path);
        System.out.println("Is saved successfully: "+ isSavedSuccessfully);

        ArrayList<Customer> retrieveCustomerList = DataFactory.readCustomerList(path);
        System.out.println("Name\t\t\tID");
        for (Customer customer : retrieveCustomerList) {
            System.out.println(customer.getName() + "\t\t\t" + customer.getId());
        }
    }
}

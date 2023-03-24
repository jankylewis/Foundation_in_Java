package ProgramEngineering.ProgrammingTechniques.ComparableInterfaceNFileManipulation;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerSortingTest {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        Customer firstCus= new Customer("BFirst Customer", 1);
        Customer secondCus= new Customer("CSecond Customer", 2);
        Customer thirdCus= new Customer("AThird Customer", 3);

        customerList.add(firstCus);
        customerList.add(secondCus);
        customerList.add(thirdCus);

        System.out.println("Before sorting the Customer List");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

        Collections.sort(customerList);
        System.out.println("After sorting the Customer List");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

}

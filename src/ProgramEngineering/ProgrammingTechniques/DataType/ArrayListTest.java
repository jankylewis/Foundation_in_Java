package ProgramEngineering.ProgrammingTechniques.DataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        //declare an object of ArrayList
        List<String> cars = new ArrayList<>();

        //add items
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("BMW");

        System.out.println("THE FIRST CAR IS: " + cars.get(1));

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).equals("Volvo")) {
//                cars.set(i, "Roll Royce");
                cars.remove(i);
            }
        }

        //for-each loop to browse the ArrayList
//        for (String car : cars) {
//            System.out.println(car);
//        }

        Integer[] intNumArr = {1, 2, 3};
        //parse Array into ArrayList
        List<Integer> intNumArrList = Arrays.asList(intNumArr);
        for (int num : intNumArrList) {
            System.out.println(num);
        }

    }

}

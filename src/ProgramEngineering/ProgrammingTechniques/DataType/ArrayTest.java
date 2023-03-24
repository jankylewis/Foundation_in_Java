package ProgramEngineering.ProgrammingTechniques.DataType;

public class ArrayTest {

    public static void main(String[] args) {

        //declare an array with two square brackets
        //we have declared a variable holding an array of strings
        String[] cars;

        //insert values to array inside the two curly braces
        cars = new String[]{"Volvo", "BMW"};
        int[] myNum = {10, 40, 50, 30, 20, 60};

//        for (int i = 0; i< cars.length; i++) {
//            System.out.println(cars[i]);
//        }
//        for (int i = 0; i< myNum.length; i++) {
//            System.out.println(myNum[i]);
//        }

        //change a value of a car where the name is Volvo

//        for (int i = 0; i< cars.length; i++) {
//            if (cars[i].contains("Volvo")) {
//                cars[i] = "G63";
//            }
//        }
//        System.out.println(cars[0]);

        //find the largest value in the array of numbers
        System.out.println("LENGTH OF MY NUM = " + myNum.length);
        int max = 1;
        for (int i = 0; i < myNum.length - 1; i++) {
            if (myNum[i] < myNum[i + 1]) {
                max = myNum[i + 1];
            }
        }
        System.out.println("LARGEST VALUE = " + max);


    }

}

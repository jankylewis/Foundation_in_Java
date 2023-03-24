package ProgramEngineering.ProgrammingTechniques.DataType;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

        //Generate a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<>();

        //Add keys and values as <Country, City>
        capitalCities.put("AEngland", "London");
        capitalCities.put("BNorway", "Olso");
        capitalCities.put("CFinland", "Helsinki");
        capitalCities.put("DVietnam", "Hanoi");

//        System.out.println("CAPITAL OF FINLAND: " + capitalCities.get("Finland").toUpperCase(Locale.ROOT));

//        capitalCities.remove("Finland");
//        capitalCities.clear();

//        System.out.println("SIZE = "+ capitalCities.size());
//        capitalCities.replace("England", "Another Capital");

        //for-each loop is to browse the HashMap
//        for (String country : capitalCities.keySet()) {
//            System.out.println("COUNTRY: "+ country);
//        }
//
//        for (String capital : capitalCities.values()) {
//            System.out.println("CAPITAL: "+ capital);
//        }

//        Set<String> allCountries = capitalCities.keySet();
//        Collection<String> allCapitals = capitalCities.values();
//
//        for (String country : allCountries) {
//            System.out.println("COUNTRY: "+ country);
//        }
//
//        for (String capital : allCapitals) {
//            System.out.println("CAPITAL: "+ capital);
//        }

        //nested HashMap
        HashMap<Integer, HashMap<String, String>> complexStudentList = new HashMap<>();
        //generate a child HashMap
        HashMap<String, String> freshStudent = new HashMap<>();
        freshStudent.put("Class", "01");
        freshStudent.put("Name", "Fresh Student");
        freshStudent.put("Age", "20");

        HashMap<String, String> experiencedStudent = new HashMap<>();
        experiencedStudent.put("Class", "02");
        experiencedStudent.put("Name", "Experienced Student");
        experiencedStudent.put("Age", "21");

        complexStudentList.put(1, freshStudent);
        complexStudentList.put(2, experiencedStudent);
//        System.out.println(complexStudentList);

//        for (Integer studentId : complexStudentList.keySet()) {
//            System.out.println("STUDENT ID = " + studentId);
//        }

        //display the name, class and age of student having id = 1
        for (Integer studentId : complexStudentList.keySet()) {
            if (studentId == 1) {
                for (HashMap studentList : complexStudentList.values()) {
                    if (Integer.parseInt(studentList.get("Class").toString()) == studentId) {
                        System.out.println("STUDENT ID = " + studentId);
                        System.out.println("STUDENT INFORMATION = " + studentList);
                    }
                }
            }
        }
    }
}



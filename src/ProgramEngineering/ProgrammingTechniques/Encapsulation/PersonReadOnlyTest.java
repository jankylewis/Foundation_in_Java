package ProgramEngineering.ProgrammingTechniques.Encapsulation;

public class PersonReadOnlyTest {

    public static void main(String[] args) {
        PersonReadOnly personReadOnly= new PersonReadOnly("Yu", 12);
        System.out.println("age = "+ personReadOnly.getAge());
        System.out.println("name = "+ personReadOnly.getName());
    }

}

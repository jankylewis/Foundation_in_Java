package ProgramEngineering.ProgrammingTechniques.Encapsulation;

public class PersonTest {

    public static void main(String[] args) {
        //first person object
        Person firstPerson = new Person();
        firstPerson.setAge(13);
        firstPerson.setName("Ali");

        //second person object
        Person secondPerson= new Person();
        secondPerson.setAge(Math.abs(-3));
        secondPerson.setName("Robby");

        System.out.println("age = " + firstPerson.getAge());
        System.out.println("name = " + firstPerson.getName());

        System.out.println("age = " + secondPerson.getAge());
        System.out.println("name = " + secondPerson.getName());

        System.out.println("\nend of program");
    }

}

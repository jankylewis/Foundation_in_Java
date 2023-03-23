package ProgramEngineering.Encapsulation;

public class PersonReadOnly {

    private String name;
    private int age;

    public PersonReadOnly(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

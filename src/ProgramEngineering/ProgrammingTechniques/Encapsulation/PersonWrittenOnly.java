package ProgramEngineering.ProgrammingTechniques.Encapsulation;

public class PersonWrittenOnly {

    private String name;
    private int age;

    public PersonWrittenOnly(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

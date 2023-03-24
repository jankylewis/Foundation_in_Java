package ProgramEngineering.ProgrammingTechniques.Encapsulation;

public class Person {

    private String name;
    private int age;

    public void setAge(int age) {
        if (age < 0 || age == 0) {
            throw new IllegalArgumentException("please provide a valid age! ");
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

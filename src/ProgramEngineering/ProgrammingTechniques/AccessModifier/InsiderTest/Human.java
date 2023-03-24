package ProgramEngineering.ProgrammingTechniques.AccessModifier.InsiderTest;

public class Human {

//    private String name;
//    private int age;
//    String name;
//    int age;
    protected String name;
    protected int age;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Human human = new Human("First Human", 33);
        /*  we are able to assign value to age variable because
        of standing in the same class */
        human.age= 35;
        System.out.println(human.getAge());
    }
}

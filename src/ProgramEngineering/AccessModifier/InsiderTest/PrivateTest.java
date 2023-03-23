package ProgramEngineering.AccessModifier.InsiderTest;

public class PrivateTest {

    public static void main(String[] args) {
        Human human = new Human("Private Human", 30);
//        cannot access age variable when standing outside that class

//        human.age;
    }
}

package ProgramEngineering.ProgrammingTechniques.AccessModifier.InsiderTest;

public class Superman extends Human {

    public Superman(String name, int age) {
        super(name, age);
    }

    public void doSomething() {
//        super.age = 20; this will be runnable when age variable is default type
//        at the parent class
    }

//    test protected
    public void adjustHumanAge(int newAge) {
        super.age = newAge;
    }

//    test protected
//    make String and age and the parent class to be protected
    public static void main(String[] args) {
        Superman superman = new Superman("Origin", 32);
        superman.adjustHumanAge(23);
        System.out.println(superman.getAge());
    }
}

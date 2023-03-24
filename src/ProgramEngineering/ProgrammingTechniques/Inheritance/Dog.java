package ProgramEngineering.ProgrammingTechniques.Inheritance;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is making his sound ...");
    }

}

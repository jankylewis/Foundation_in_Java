package ProgramEngineering.Inheritance;

public class Cat extends Animal {

    /*  because inherit from Animal class (with a constructor),
        so this class has to create a constructor to (as super class)
     */

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is making his sound ...");
        System.out.println("I am the " + this.getName() + "with color is " + this.getColor());
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        Cat cat = new Cat("First Cat", "Purple");
        cat.makeSound();
        Dog dog = new Dog("First Dog", "White");
        dog.makeSound();
    }
}

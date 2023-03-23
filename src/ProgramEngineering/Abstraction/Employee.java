package ProgramEngineering.Abstraction;

public abstract class Employee {

    protected static final double FTE_SALARY_FACTOR = 1.0;
    protected static final double CONTRACT_SALARY_FACTOR = 0.8;
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBiweeklySalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

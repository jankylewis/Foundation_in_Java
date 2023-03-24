package ProgramEngineering.ProgrammingTechniques.AbstractionNInterface;

public class ContractEmployee extends Employee {

    static final double RATE = 40.0;
    private double salary;

    public ContractEmployee(String name, int age) {
        super(name, age);
    }

    @Override
    public double calculateBiweeklySalary() {
        double salary = CONTRACT_SALARY_FACTOR * RATE;
        this.salary = salary;
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", and this is a contract employee this salary: " + calculateBiweeklySalary();
    }
}

package ProgramEngineering.ProgrammingTechniques.AbstractionNInterface;

public class FulltimeEmployee extends Employee implements Insurance, Bonus {

    static final double RATE = 50.0;
    private double salary;

    public FulltimeEmployee(String name, int age) {
        super(name, age);
    }

    @Override
    public double calculateBiweeklySalary() {
        double salary = FTE_SALARY_FACTOR * RATE;
        this.salary = salary;
        return this.salary + this.getInsurance() + this.getBonus();
    }

    @Override
    public String toString() {
        return super.toString() + ", and this is a full-time employee this salary: " + calculateBiweeklySalary();
    }

    @Override
    public double getInsurance() {
        return 50;
    }

    @Override
    public double getBonus() {
        return 100;
    }
}

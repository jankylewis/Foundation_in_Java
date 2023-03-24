package ProgramEngineering.ProgrammingTechniques.AbstractionNInterface;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee fte = new FulltimeEmployee("Witch", 20);
        fte.calculateBiweeklySalary();
        System.out.println(fte);

        Employee ce = new ContractEmployee("Thanos", 50);
        ce.calculateBiweeklySalary();
        System.out.println(ce);
    }
}

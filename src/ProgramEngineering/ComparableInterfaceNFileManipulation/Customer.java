package ProgramEngineering.ComparableInterfaceNFileManipulation;

public class Customer implements Comparable<Customer> {

    private String name;
    private int id;

    public Customer() {

    }

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Customer thatCustomer) {
        return this.getName().compareToIgnoreCase(thatCustomer.getName());
    }
}

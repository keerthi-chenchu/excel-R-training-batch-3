public class FullTimeEmployee extends Employee {
    private double basic;
    private double bonus;

    public FullTimeEmployee() {}

    public FullTimeEmployee(int id, String firstName, String lastName, String address, double basic, double bonus) {
        super(id, firstName, lastName, address);
        this.basic = basic;
        this.bonus = bonus;
    }

    public double computeSal() {
        return basic + bonus;
    }

    public void showDetails() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Basic Salary: " + basic);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + computeSal());
        }
}






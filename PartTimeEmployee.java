class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double amountPerHour;

    public PartTimeEmployee() {}

    public PartTimeEmployee(int id, String firstName, String lastName, String address, int hoursWorked, double amountPerHour) {
        super(id, firstName, lastName, address);
        this.hoursWorked = hoursWorked;
        this.amountPerHour = amountPerHour;
    }

    public double computeSal() {
        return hoursWorked * amountPerHour;
    }

    public void showDetails() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Amount Per Hour: " + amountPerHour);
        System.out.println("Salary: " + computeSal());}
}






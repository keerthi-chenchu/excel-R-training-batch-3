public class EmployeeDetails {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(1, "John", "Doe", "123 Street", 20, 15.5);
        partTimeEmployee.showDetails();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(2, "Jane", "Smith", "456 Avenue", 50000, 10000);
        fullTimeEmployee.showDetails();
        }
}



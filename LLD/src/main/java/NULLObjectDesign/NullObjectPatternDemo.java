package NULLObjectDesign;

/**
 * The type Null object pattern demo.
 */
public class NullObjectPatternDemo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployee("Alice");
        Employee employee2 = EmployeeFactory.getEmployee("Bob");
        Employee employee3 = EmployeeFactory.getEmployee("John"); // does not exist
        Employee employee4 = EmployeeFactory.getEmployee("Charlie");

        System.out.println("Employees:");
        printEmployeeDetails(employee1);
        printEmployeeDetails(employee2);
        printEmployeeDetails(employee3);
        printEmployeeDetails(employee4);
    }

    /**
     * Print employee details.
     *
     * @param employee the employee
     */
    private static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Role: " + employee.getRole());
        System.out.println("Is Null: " + employee.isNull());
        System.out.println();
    }
}


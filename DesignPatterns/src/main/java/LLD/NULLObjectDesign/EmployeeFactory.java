package LLD.NULLObjectDesign;

/**
 * The type Employee factory.
 */
class EmployeeFactory {
    /**
     * The constant names.
     */
    public static final String[] names = {"Alice", "Bob", "Charlie"};

    /**
     * Gets employee.
     *
     * @param name the name
     * @return the employee
     */
    public static Employee getEmployee(String name) {
        for (String n : names) {
            if (n.equalsIgnoreCase(name)) {
                return new ConcreteEmployee(name, "Developer");
            }
        }
        return new NullEmployee();
    }
}


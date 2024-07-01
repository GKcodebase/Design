package LLD.NULLObjectDesign;


/**
 * The type Concrete employee.
 */
class ConcreteEmployee implements Employee {
    /**
     * The Name.
     */
    private String name;
    /**
     * The Role.
     */
    private String role;

    /**
     * Instantiates a new Concrete employee.
     *
     * @param name the name
     * @param role the role
     */
    public ConcreteEmployee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    @Override
    public String getRole() {
        return role;
    }

    /**
     * Is null boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean isNull() {
        return false;
    }
}


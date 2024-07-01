package LLD.NULLObjectDesign;

/**
 * The type Null employee.
 */
class NullEmployee implements Employee {
    /**
     * Gets name.
     *
     * @return the name
     */
    @Override
    public String getName() {
        return "Not Available";
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    @Override
    public String getRole() {
        return "No Role Assigned";
    }

    /**
     * Is null boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean isNull() {
        return true;
    }
}


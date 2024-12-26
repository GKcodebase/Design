package VendingMachine;

/**
 * The enum Coin.
 */
public enum Coin {
    /**
     * Penny coin.
     */
    PENNY(0.01),
    /**
     * Nickel coin.
     */
    NICKEL(0.05),
    /**
     * Dime coin.
     */
    DIME(0.10),
    /**
     * Quarter coin.
     */
    QUARTER(0.25),
    /**
     * Dollar coin.
     */
    DOLLAR(1.00);

    /**
     * The Value.
     */
    private double value;

    /**
     * Instantiates a new Coin.
     *
     * @param value the value
     */
    Coin(double value) {
        this.value = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public double getValue() {
        return value;
    }
}

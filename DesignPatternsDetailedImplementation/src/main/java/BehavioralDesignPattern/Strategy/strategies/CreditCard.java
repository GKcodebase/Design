package BehavioralDesignPattern.Strategy.strategies;

/**
 * The type Credit card.
 */
public class CreditCard {
    /**
     * The Amount.
     */
    private int amount;
    /**
     * The Number.
     */
    private String number;
    /**
     * The Date.
     */
    private String date;
    /**
     * The Cvv.
     */
    private String cvv;

    /**
     * Instantiates a new Credit card.
     *
     * @param number the number
     * @param date   the date
     * @param cvv    the cvv
     */
    CreditCard(String number, String date, String cvv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }
}


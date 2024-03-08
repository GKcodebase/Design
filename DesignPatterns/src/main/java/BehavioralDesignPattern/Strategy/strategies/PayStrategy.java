package BehavioralDesignPattern.Strategy.strategies;

/**
 * The interface Pay strategy.
 */
public interface PayStrategy {
    /**
     * Pay boolean.
     *
     * @param paymentAmount the payment amount
     * @return the boolean
     */
    boolean pay(int paymentAmount);

    /**
     * Collect payment details.
     */
    void collectPaymentDetails();
}

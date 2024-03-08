package BehavioralDesignPattern.Strategy.order;

import BehavioralDesignPattern.Strategy.strategies.PayStrategy;

/**
 * The type Order.
 */
public class Order {
    /**
     * The Total cost.
     */
    private int totalCost = 0;
    /**
     * The Is closed.
     */
    private boolean isClosed = false;

    /**
     * Process order.
     *
     * @param strategy the strategy
     */
    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // Here we could collect and store payment data from the strategy.
    }

    /**
     * Sets total cost.
     *
     * @param cost the cost
     */
    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    /**
     * Gets total cost.
     *
     * @return the total cost
     */
    public int getTotalCost() {
        return totalCost;
    }

    /**
     * Is closed boolean.
     *
     * @return the boolean
     */
    public boolean isClosed() {
        return isClosed;
    }

    /**
     * Sets closed.
     */
    public void setClosed() {
        isClosed = true;
    }
}

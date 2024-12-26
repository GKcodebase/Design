package CheatSheet.BehaviourialDesignPattern;

/**
 * The type Strategy.
 */
public class Strategy {
    /**
     * The interface Payment strategy.
     */
// Strategy Interface
    interface PaymentStrategy {
        /**
         * Pay.
         *
         * @param amount the amount
         */
        void pay(int amount);
    }

    /**
     * The type Credit card payment.
     */
// Concrete Strategies
    class CreditCardPayment implements PaymentStrategy {
        /**
         * The Card number.
         */
        private final String cardNumber;
        /**
         * The Cvv.
         */
        private final String cvv;

        /**
         * Instantiates a new Credit card payment.
         *
         * @param cardNumber the card number
         * @param cvv        the cvv
         */
        public CreditCardPayment(String cardNumber, String cvv) {
            this.cardNumber = cardNumber;
            this.cvv = cvv;
        }

        /**
         * Pay.
         *
         * @param amount the amount
         */
        @Override
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    /**
     * The type Pay pal payment.
     */
    class PayPalPayment implements PaymentStrategy {
        /**
         * The Email.
         */
        private final String email;

        /**
         * Instantiates a new Pay pal payment.
         *
         * @param email the email
         */
        public PayPalPayment(String email) {
            this.email = email;
        }

        /**
         * Pay.
         *
         * @param amount the amount
         */
        @Override
        public void pay(int amount) {
            System.out.println("Paid " + amount + " using PayPal");
        }
    }

    /**
     * The type Shopping cart.
     */
//Context Class
    class ShoppingCart {
        /**
         * The Payment strategy.
         */
        private PaymentStrategy paymentStrategy;

        /**
         * Sets payment strategy.
         *
         * @param paymentStrategy the payment strategy
         */
        public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        /**
         * Checkout.
         *
         * @param amount the amount
         */
        public void checkout(int amount) {
            paymentStrategy.pay(amount);
        }
    }

}

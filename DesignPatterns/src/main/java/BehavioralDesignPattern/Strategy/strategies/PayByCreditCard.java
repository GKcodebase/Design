package BehavioralDesignPattern.Strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The type Pay by credit card.
 */
public class PayByCreditCard implements PayStrategy {
    /**
     * The Reader.
     */
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    /**
     * The Card.
     */
    private CreditCard card;

    /**
     * Collect credit card data.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Enter the CVV code: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

            // Validate credit card number...

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * After card validation we can charge customer's credit card.
     *
     * @param paymentAmount the payment amount
     * @return the boolean
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Card is present boolean.
     *
     * @return the boolean
     */
    private boolean cardIsPresent() {
        return card != null;
    }
}

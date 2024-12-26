package BehavioralDesignPattern.Strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Pay by pay pal.
 */
public class PayByPayPal implements PayStrategy {
    /**
     * The constant DATA_BASE.
     */
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    /**
     * The Reader.
     */
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    /**
     * The Email.
     */
    private String email;
    /**
     * The Password.
     */
    private String password;
    /**
     * The Signed in.
     */
    private boolean signedIn;

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    /**
     * Collect customer's data.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Enter the user's email: ");
                email = READER.readLine();
                System.out.print("Enter the password: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Verify boolean.
     *
     * @return the boolean
     */
    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    /**
     * Save customer data for future shopping attempts.
     *
     * @param paymentAmount the payment amount
     * @return the boolean
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    /**
     * Sets signed in.
     *
     * @param signedIn the signed in
     */
    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}

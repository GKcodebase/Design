package Encapsulation;

/**
 * The type Bank account.
 */
// Class definition for BankAccount
public class BankAccount {
    /**
     * The Balance.
     */
    private double balance;  // Private attribute

    /**
     * Instantiates a new Bank account.
     *
     * @param balance the balance
     */
// Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Deposit.
     *
     * @param amount the amount
     */
// Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /**
     * Withdraw.
     *
     * @param amount the amount
     */
// Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
// Method to get balance
    public double getBalance() {
        return balance;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
// Main method
    public static void main(String[] args) {
        // Creating object
        BankAccount account = new BankAccount(1000);

        // Accessing balance indirectly
        System.out.println(account.getBalance());  // Output: 1000

        // Depositing money
        account.deposit(500);
        System.out.println(account.getBalance());  // Output: 1500
    }
}

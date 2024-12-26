package VendingMachine;

import java.util.Map;

/**
 * The type Vending machine.
 */
public class VendingMachine {
    /**
     * The Inventory.
     */
    private Inventory inventory = new Inventory();
    /**
     * The Current balance.
     */
    private double currentBalance = 0.0;
    /**
     * The Current item.
     */
    private Item currentItem = null;

    /**
     * Add item.
     *
     * @param item     the item
     * @param quantity the quantity
     */
    public void addItem(Item item, int quantity) {
        inventory.addItem(item, quantity);
    }

    /**
     * Select item.
     *
     * @param item the item
     */
    public void selectItem(Item item) {
        if (inventory.getQuantity(item) > 0) {
            currentItem = item;
            System.out.println("Selected item: " + item.getName() + " - Price: " + item.getPrice());
        } else {
            System.out.println("Item out of stock.");
        }
    }

    /**
     * Insert coin.
     *
     * @param coin the coin
     */
    public void insertCoin(Coin coin) {
        currentBalance += coin.getValue();
        System.out.println("Inserted coin: " + coin.getValue() + " - Current balance: " + currentBalance);
    }

    /**
     * Dispense item.
     */
    public void dispenseItem() {
        if (currentItem != null && currentBalance >= currentItem.getPrice()) {
            inventory.removeItem(currentItem);
            currentBalance -= currentItem.getPrice();
            System.out.println("Dispensed item: " + currentItem.getName());
            returnChange();
            currentItem = null;
        } else if (currentItem != null) {
            System.out.println("Insufficient balance. Please insert more coins.");
        } else {
            System.out.println("No item selected.");
        }
    }

    /**
     * Return change.
     */
    public void returnChange() {
        if (currentBalance > 0) {
            System.out.println("Returning change: " + currentBalance);
            currentBalance = 0.0;
        }
    }

    /**
     * Display items.
     */
    public void displayItems() {
        System.out.println("Available items:");
        for (Map.Entry<Item, Integer> entry : inventory.getItems().entrySet()) {
            System.out.println(entry.getKey().getName() + " - Price: " + entry.getKey().getPrice() + " - Quantity: " + entry.getValue());
        }
    }
}


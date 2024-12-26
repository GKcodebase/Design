package VendingMachine;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Inventory.
 */
public class Inventory {
    /**
     * The Inventory.
     */
    private Map<Item, Integer> inventory = new HashMap<>();

    /**
     * Add item.
     *
     * @param item     the item
     * @param quantity the quantity
     */
    public void addItem(Item item, int quantity) {
        int count = inventory.getOrDefault(item, 0);
        inventory.put(item, count + quantity);
    }

    /**
     * Remove item.
     *
     * @param item the item
     */
    public void removeItem(Item item) {
        if (inventory.containsKey(item)) {
            int count = inventory.get(item);
            if (count > 1) {
                inventory.put(item, count - 1);
            } else {
                inventory.remove(item);
            }
        }
    }

    /**
     * Gets quantity.
     *
     * @param item the item
     * @return the quantity
     */
    public int getQuantity(Item item) {
        return inventory.getOrDefault(item, 0);
    }

    /**
     * Gets items.
     *
     * @return the items
     */
    public Map<Item, Integer> getItems() {
        return inventory;
    }
}


package VendingMachine;

/**
 * The type Item.
 */
public class Item {
    /**
     * The Name.
     */
    private String name;
    /**
     * The Price.
     */
    private double price;

    /**
     * Instantiates a new Item.
     *
     * @param name  the name
     * @param price the price
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }
}


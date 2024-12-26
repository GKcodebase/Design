package VendingMachine;

/**
 * The type User interface.
 */
public class UserInterface {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        // Adding items to the vending machine
        Item soda = new Item("Soda", 1.25);
        Item chips = new Item("Chips", 1.00);
        Item candy = new Item("Candy", 0.75);

        vm.addItem(soda, 10);
        vm.addItem(chips, 5);
        vm.addItem(candy, 20);

        // Display items
        vm.displayItems();

        // User interaction simulation
        vm.selectItem(soda);
        vm.insertCoin(Coin.DOLLAR);
        vm.insertCoin(Coin.QUARTER);
        vm.dispenseItem();

        // Display remaining items
        vm.displayItems();
    }
}


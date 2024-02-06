package CreationalDesignPattern.Abstract.buttons;

/**
 * The type Windows button.
 */
public class WindowsButton implements Button {

    /**
     * Paint.
     */
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
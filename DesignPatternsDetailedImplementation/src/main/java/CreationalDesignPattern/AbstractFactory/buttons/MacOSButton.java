package CreationalDesignPattern.AbstractFactory.buttons;

/**
 * The type Mac os button.
 */
public class MacOSButton implements Button {

    /**
     * Paint.
     */
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
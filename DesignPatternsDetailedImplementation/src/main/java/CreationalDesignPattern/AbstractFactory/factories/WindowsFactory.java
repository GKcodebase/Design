package CreationalDesignPattern.AbstractFactory.factories;

import CreationalDesignPattern.AbstractFactory.buttons.Button;
import CreationalDesignPattern.AbstractFactory.buttons.WindowsButton;
import CreationalDesignPattern.AbstractFactory.checkboxes.Checkbox;
import CreationalDesignPattern.AbstractFactory.checkboxes.WindowsCheckbox;


/**
 * The type Windows factory.
 */
public class WindowsFactory implements GUIFactory {

    /**
     * Create button button.
     *
     * @return the button
     */
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    /**
     * Create checkbox checkbox.
     *
     * @return the checkbox
     */
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
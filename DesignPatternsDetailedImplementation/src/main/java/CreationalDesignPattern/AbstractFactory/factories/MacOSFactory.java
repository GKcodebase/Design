package CreationalDesignPattern.AbstractFactory.factories;

import CreationalDesignPattern.AbstractFactory.buttons.Button;
import CreationalDesignPattern.AbstractFactory.buttons.MacOSButton;
import CreationalDesignPattern.AbstractFactory.checkboxes.Checkbox;
import CreationalDesignPattern.AbstractFactory.checkboxes.MacOSCheckbox;

/**
 * The type Mac os factory.
 */
public class MacOSFactory implements GUIFactory {

    /**
     * Create button button.
     *
     * @return the button
     */
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    /**
     * Create checkbox checkbox.
     *
     * @return the checkbox
     */
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
package CreationalDesignPattern.AbstractFactory.factories;

import CreationalDesignPattern.AbstractFactory.buttons.Button;
import CreationalDesignPattern.AbstractFactory.checkboxes.Checkbox;

/**
 * The interface Gui factory.
 */
public interface GUIFactory {
    /**
     * Create button button.
     *
     * @return the button
     */
    Button createButton();

    /**
     * Create checkbox checkbox.
     *
     * @return the checkbox
     */
    Checkbox createCheckbox();
}
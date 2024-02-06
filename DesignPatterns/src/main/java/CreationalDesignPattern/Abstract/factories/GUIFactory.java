package CreationalDesignPattern.Abstract.factories;

import CreationalDesignPattern.Abstract.buttons.Button;
import CreationalDesignPattern.Abstract.checkboxes.Checkbox;

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
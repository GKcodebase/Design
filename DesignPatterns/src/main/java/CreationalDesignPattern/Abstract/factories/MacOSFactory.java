package CreationalDesignPattern.Abstract.factories;

import CreationalDesignPattern.Abstract.buttons.Button;
import CreationalDesignPattern.Abstract.buttons.MacOSButton;
import CreationalDesignPattern.Abstract.checkboxes.Checkbox;
import CreationalDesignPattern.Abstract.checkboxes.MacOSCheckbox;

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
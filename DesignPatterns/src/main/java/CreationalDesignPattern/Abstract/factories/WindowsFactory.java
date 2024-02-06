package CreationalDesignPattern.Abstract.factories;

import CreationalDesignPattern.Abstract.buttons.Button;
import CreationalDesignPattern.Abstract.buttons.WindowsButton;
import CreationalDesignPattern.Abstract.checkboxes.Checkbox;
import CreationalDesignPattern.Abstract.checkboxes.WindowsCheckbox;


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
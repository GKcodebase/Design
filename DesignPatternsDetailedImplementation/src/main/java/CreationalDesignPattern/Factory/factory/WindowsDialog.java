package CreationalDesignPattern.Factory.factory;

import CreationalDesignPattern.Factory.buttons.Button;
import CreationalDesignPattern.Factory.buttons.WindowsButton;

/**
 * The type Windows dialog.
 */
public class WindowsDialog extends Dialog {

    /**
     * Create button button.
     *
     * @return the button
     */
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

package CreationalDesignPattern.Factory.factory;

import CreationalDesignPattern.Factory.buttons.Button;
import CreationalDesignPattern.Factory.buttons.HtmlButton;

/**
 * The type Html dialog.
 */
public class HtmlDialog extends Dialog {

    /**
     * Create button button.
     *
     * @return the button
     */
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

package CreationalDesignPattern.Abstract.app;

import CreationalDesignPattern.Abstract.buttons.Button;
import CreationalDesignPattern.Abstract.checkboxes.Checkbox;
import CreationalDesignPattern.Abstract.factories.GUIFactory;

/**
 * The type Application.
 */
public class Application {
    /**
     * The Button.
     */
    private Button button;
    /**
     * The Checkbox.
     */
    private Checkbox checkbox;

    /**
     * Instantiates a new Application.
     *
     * @param factory the factory
     */
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    /**
     * Paint.
     */
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
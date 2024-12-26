package CreationalDesignPattern.AbstractFactory.app;

import CreationalDesignPattern.AbstractFactory.buttons.Button;
import CreationalDesignPattern.AbstractFactory.checkboxes.Checkbox;
import CreationalDesignPattern.AbstractFactory.factories.GUIFactory;

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
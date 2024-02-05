package CreationalDesignPattern.Abstract.app;

import CreationalDesignPattern.Abstract.buttons.Button;
import CreationalDesignPattern.Abstract.checkboxes.Checkbox;
import CreationalDesignPattern.Abstract.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
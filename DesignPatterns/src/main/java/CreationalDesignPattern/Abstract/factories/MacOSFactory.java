package CreationalDesignPattern.Abstract.factories;

import CreationalDesignPattern.Abstract.buttons.Button;
import CreationalDesignPattern.Abstract.buttons.MacOSButton;
import CreationalDesignPattern.Abstract.checkboxes.Checkbox;
import CreationalDesignPattern.Abstract.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
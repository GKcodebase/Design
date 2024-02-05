package CreationalDesignPattern.Abstract.factories;

import CreationalDesignPattern.Abstract.buttons.Button;
import CreationalDesignPattern.Abstract.buttons.WindowsButton;
import CreationalDesignPattern.Abstract.checkboxes.Checkbox;
import CreationalDesignPattern.Abstract.checkboxes.WindowsCheckbox;


public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
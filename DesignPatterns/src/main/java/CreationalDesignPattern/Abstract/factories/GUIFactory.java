package CreationalDesignPattern.Abstract.factories;

import CreationalDesignPattern.Abstract.buttons.Button;
import CreationalDesignPattern.Abstract.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
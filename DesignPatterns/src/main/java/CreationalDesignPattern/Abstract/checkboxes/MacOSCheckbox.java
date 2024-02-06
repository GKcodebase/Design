package CreationalDesignPattern.Abstract.checkboxes;

/**
 * The type Mac os checkbox.
 */
public class MacOSCheckbox implements Checkbox {

    /**
     * Paint.
     */
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
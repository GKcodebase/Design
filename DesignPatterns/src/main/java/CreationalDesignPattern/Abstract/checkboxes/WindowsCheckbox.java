package CreationalDesignPattern.Abstract.checkboxes;

/**
 * The type Windows checkbox.
 */
public class WindowsCheckbox implements Checkbox {

    /**
     * Paint.
     */
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
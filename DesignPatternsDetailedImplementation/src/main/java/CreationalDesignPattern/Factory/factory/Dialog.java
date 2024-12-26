package CreationalDesignPattern.Factory.factory;

import CreationalDesignPattern.Factory.buttons.Button;

/**
 * The type Dialog.
 */
public abstract class Dialog {

    /**
     * Render window.
     */
    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     *
     * @return the button
     */
    public abstract Button createButton();
}

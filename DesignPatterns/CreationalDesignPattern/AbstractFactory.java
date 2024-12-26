package CheatSheet.CreationalDesignPattern;

/**
 * The Abstract factory.
 */
public class AbstractFactory {
    /**
     * The interface Button.
     */
    interface Button{
        /**
         * Paint.
         */
        void paint();
    }

    /**
     * The interface Check box.
     */
    interface CheckBox{
        /**
         * Paint.
         */
        void paint();
    }

    /**
     * The type Windows button.
     */
// Concrete Products for Windows
    class WindowsButton implements Button {
        /**
         * Paint.
         */
        public void paint() {
            System.out.println("Rendering a Windows button");
        }
    }

    /**
     * The type Windows checkbox.
     */
    class WindowsCheckbox implements CheckBox {
        /**
         * Paint.
         */
        public void paint() {
            System.out.println("Rendering a Windows checkbox");
        }
    }

    /**
     * The type Mac button.
     */
// Concrete Products for MacOS
    class MacButton implements Button {
        /**
         * Paint.
         */
        public void paint() {
            System.out.println("Rendering a Mac button");
        }
    }

    /**
     * The type Mac checkbox.
     */
    class MacCheckbox implements CheckBox {
        /**
         * Paint.
         */
        public void paint() {
            System.out.println("Rendering a Mac checkbox");
        }
    }


    /**
     * The interface Gui factory.
     */
//Abstract Factory
    interface GUIFactory{
        /**
         * Create button button.
         *
         * @return the button
         */
        Button createButton();

        /**
         * Create check box check box.
         *
         * @return the check box
         */
        CheckBox createCheckBox();
    }

    /**
     * The type Window factory.
     */
    class WindowFactory implements GUIFactory{

        /**
         * Create button button.
         *
         * @return the button
         */
        @Override
        public Button createButton() {
            return new WindowsButton();
        }

        /**
         * Create check box check box.
         *
         * @return the check box
         */
        @Override
        public CheckBox createCheckBox() {
            return new WindowsCheckbox();
        }
    }

    /**
     * The type Mac os factory.
     */
    class MacOsFactory implements GUIFactory{

        /**
         * Create button button.
         *
         * @return the button
         */
        @Override
        public Button createButton() {
            return new MacButton();
        }

        /**
         * Create check box check box.
         *
         * @return the check box
         */
        @Override
        public CheckBox createCheckBox() {
            return new MacCheckbox();
        }
    }

}


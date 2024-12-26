package CreationalDesignPattern.Factory.buttons;

/**
 * The type Html button.
 */
public class HtmlButton implements Button {

    /**
     * Render.
     */
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    /**
     * On click.
     */
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}

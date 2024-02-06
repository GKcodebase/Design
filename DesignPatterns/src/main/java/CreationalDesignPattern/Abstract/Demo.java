package CreationalDesignPattern.Abstract;

import CreationalDesignPattern.Abstract.app.Application;
import CreationalDesignPattern.Abstract.factories.GUIFactory;
import CreationalDesignPattern.Abstract.factories.MacOSFactory;
import CreationalDesignPattern.Abstract.factories.WindowsFactory;

/**
 * The type Demo.
 */
public class Demo {

    /**
     * Configure application application.
     *
     * @return the application
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
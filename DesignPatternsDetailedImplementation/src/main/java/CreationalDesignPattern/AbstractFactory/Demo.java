package CreationalDesignPattern.AbstractFactory;

import CreationalDesignPattern.AbstractFactory.app.Application;
import CreationalDesignPattern.AbstractFactory.factories.GUIFactory;
import CreationalDesignPattern.AbstractFactory.factories.MacOSFactory;
import CreationalDesignPattern.AbstractFactory.factories.WindowsFactory;

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
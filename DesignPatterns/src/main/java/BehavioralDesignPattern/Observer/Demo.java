package BehavioralDesignPattern.Observer;

import BehavioralDesignPattern.Observer.editor.Editor;
import BehavioralDesignPattern.Observer.listeners.EmailNotificationListener;
import BehavioralDesignPattern.Observer.listeners.LogOpenListener;

/**
 * The type Demo.
 */
public class Demo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

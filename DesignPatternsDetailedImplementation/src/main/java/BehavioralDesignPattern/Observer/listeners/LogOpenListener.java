package BehavioralDesignPattern.Observer.listeners;

import java.io.File;

/**
 * The type Log open listener.
 */
public class LogOpenListener implements EventListener {
    /**
     * The Log.
     */
    private File log;

    /**
     * Instantiates a new Log open listener.
     *
     * @param fileName the file name
     */
    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    /**
     * Update.
     *
     * @param eventType the event type
     * @param file      the file
     */
    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}

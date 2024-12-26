package BehavioralDesignPattern.Observer.listeners;

import java.io.File;

/**
 * The interface Event listener.
 */
public interface EventListener {
    /**
     * Update.
     *
     * @param eventType the event type
     * @param file      the file
     */
    void update(String eventType, File file);
}

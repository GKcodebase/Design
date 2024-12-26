package BehavioralDesignPattern.Observer.publisher;

import BehavioralDesignPattern.Observer.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Event manager.
 */
public class EventManager {
    /**
     * The Listeners.
     */
    Map<String, List<EventListener>> listeners = new HashMap<>();

    /**
     * Instantiates a new Event manager.
     *
     * @param operations the operations
     */
    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    /**
     * Subscribe.
     *
     * @param eventType the event type
     * @param listener  the listener
     */
    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    /**
     * Unsubscribe.
     *
     * @param eventType the event type
     * @param listener  the listener
     */
    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    /**
     * Notify.
     *
     * @param eventType the event type
     * @param file      the file
     */
    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}

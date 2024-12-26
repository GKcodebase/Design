package BehavioralDesignPattern.Observer.listeners;

import java.io.File;

/**
 * The type Email notification listener.
 */
public class EmailNotificationListener implements EventListener {
    /**
     * The Email.
     */
    private String email;

    /**
     * Instantiates a new Email notification listener.
     *
     * @param email the email
     */
    public EmailNotificationListener(String email) {
        this.email = email;
    }

    /**
     * Update.
     *
     * @param eventType the event type
     * @param file      the file
     */
    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}

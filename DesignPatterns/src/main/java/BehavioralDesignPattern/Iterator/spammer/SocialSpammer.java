package BehavioralDesignPattern.Iterator.spammer;

import BehavioralDesignPattern.Iterator.iterators.ProfileIterator;
import BehavioralDesignPattern.Iterator.profile.Profile;
import BehavioralDesignPattern.Iterator.social_networks.SocialNetwork;

/**
 * The type Social spammer.
 */
public class SocialSpammer {
    /**
     * The Network.
     */
    public SocialNetwork network;
    /**
     * The Iterator.
     */
    public ProfileIterator iterator;

    /**
     * Instantiates a new Social spammer.
     *
     * @param network the network
     */
    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    /**
     * Send spam to friends.
     *
     * @param profileEmail the profile email
     * @param message      the message
     */
    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("\nIterating over friends...\n");
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    /**
     * Send spam to coworkers.
     *
     * @param profileEmail the profile email
     * @param message      the message
     */
    public void sendSpamToCoworkers(String profileEmail, String message) {
        System.out.println("\nIterating over coworkers...\n");
        iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    /**
     * Send message.
     *
     * @param email   the email
     * @param message the message
     */
    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}

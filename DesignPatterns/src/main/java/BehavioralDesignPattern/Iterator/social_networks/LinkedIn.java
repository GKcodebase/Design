package BehavioralDesignPattern.Iterator.social_networks;

import BehavioralDesignPattern.Iterator.iterators.LinkedInIterator;
import BehavioralDesignPattern.Iterator.iterators.ProfileIterator;
import BehavioralDesignPattern.Iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Linked in.
 */
public class LinkedIn implements SocialNetwork {
    /**
     * The Contacts.
     */
    private List<Profile> contacts;

    /**
     * Instantiates a new Linked in.
     *
     * @param cache the cache
     */
    public LinkedIn(List<Profile> cache) {
        if (cache != null) {
            this.contacts = cache;
        } else {
            this.contacts = new ArrayList<>();
        }
    }

    /**
     * Request contact info from linked in api profile.
     *
     * @param profileEmail the profile email
     * @return the profile
     */
    public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
        // Here would be a POST request to one of the LinkedIn API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading profile '" + profileEmail + "' over the network...");

        // ...and return test data.
        return findContact(profileEmail);
    }

    /**
     * Request related contacts from linked in api list.
     *
     * @param profileEmail the profile email
     * @param contactType  the contact type
     * @return the list
     */
    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType) {
        // Here would be a POST request to one of the LinkedIn API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life.
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        // ...and return test data.
        Profile profile = findContact(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    /**
     * Find contact profile.
     *
     * @param profileEmail the profile email
     * @return the profile
     */
    private Profile findContact(String profileEmail) {
        for (Profile profile : contacts) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    /**
     * Simulate network latency.
     */
    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Create friends iterator profile iterator.
     *
     * @param profileEmail the profile email
     * @return the profile iterator
     */
    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    /**
     * Create coworkers iterator profile iterator.
     *
     * @param profileEmail the profile email
     * @return the profile iterator
     */
    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}

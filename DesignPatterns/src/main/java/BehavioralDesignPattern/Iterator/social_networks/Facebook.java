package BehavioralDesignPattern.Iterator.social_networks;

import BehavioralDesignPattern.Iterator.iterators.FacebookIterator;
import BehavioralDesignPattern.Iterator.iterators.ProfileIterator;
import BehavioralDesignPattern.Iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Facebook.
 */
public class Facebook implements SocialNetwork {
    /**
     * The Profiles.
     */
    private List<Profile> profiles;

    /**
     * Instantiates a new Facebook.
     *
     * @param cache the cache
     */
    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    /**
     * Request profile from facebook profile.
     *
     * @param profileEmail the profile email
     * @return the profile
     */
    public Profile requestProfileFromFacebook(String profileEmail) {
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        System.out.println("Facebook: Loading profile '" + profileEmail + "' over the network...");

        // ...and return test data.
        return findProfile(profileEmail);
    }

    /**
     * Request profile friends from facebook list.
     *
     * @param profileEmail the profile email
     * @param contactType  the contact type
     * @return the list
     */
    public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        // ...and return test data.
        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    /**
     * Find profile profile.
     *
     * @param profileEmail the profile email
     * @return the profile
     */
    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
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
        return new FacebookIterator(this, "friends", profileEmail);
    }

    /**
     * Create coworkers iterator profile iterator.
     *
     * @param profileEmail the profile email
     * @return the profile iterator
     */
    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }

}

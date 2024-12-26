package BehavioralDesignPattern.Iterator.iterators;

import BehavioralDesignPattern.Iterator.profile.Profile;
import BehavioralDesignPattern.Iterator.social_networks.Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Facebook iterator.
 */
public class FacebookIterator implements ProfileIterator {
    /**
     * The Facebook.
     */
    private Facebook facebook;
    /**
     * The Type.
     */
    private String type;
    /**
     * The Email.
     */
    private String email;
    /**
     * The Current position.
     */
    private int currentPosition = 0;
    /**
     * The Emails.
     */
    private List<String> emails = new ArrayList<>();
    /**
     * The Profiles.
     */
    private List<Profile> profiles = new ArrayList<>();

    /**
     * Instantiates a new Facebook iterator.
     *
     * @param facebook the facebook
     * @param type     the type
     * @param email    the email
     */
    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    /**
     * Lazy load.
     */
    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    /**
     * Has next boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    /**
     * Gets next.
     *
     * @return the next
     */
    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    /**
     * Reset.
     */
    @Override
    public void reset() {
        currentPosition = 0;
    }
}

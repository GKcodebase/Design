package BehavioralDesignPattern.Iterator.iterators;

import BehavioralDesignPattern.Iterator.profile.Profile;
import BehavioralDesignPattern.Iterator.social_networks.LinkedIn;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Linked in iterator.
 */
public class LinkedInIterator implements ProfileIterator {
    /**
     * The Linked in.
     */
    private LinkedIn linkedIn;
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
     * The Contacts.
     */
    private List<Profile> contacts = new ArrayList<>();

    /**
     * Instantiates a new Linked in iterator.
     *
     * @param linkedIn the linked in
     * @param type     the type
     * @param email    the email
     */
    public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.email = email;
    }

    /**
     * Lazy load.
     */
    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = linkedIn.requestRelatedContactsFromLinkedInAPI(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.contacts.add(null);
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
        Profile friendContact = contacts.get(currentPosition);
        if (friendContact == null) {
            friendContact = linkedIn.requestContactInfoFromLinkedInAPI(friendEmail);
            contacts.set(currentPosition, friendContact);
        }
        currentPosition++;
        return friendContact;
    }

    /**
     * Reset.
     */
    @Override
    public void reset() {
        currentPosition = 0;
    }
}

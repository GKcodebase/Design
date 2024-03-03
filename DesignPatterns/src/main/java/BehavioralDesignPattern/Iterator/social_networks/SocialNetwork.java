package BehavioralDesignPattern.Iterator.social_networks;

import BehavioralDesignPattern.Iterator.iterators.ProfileIterator;

/**
 * The interface Social network.
 */
public interface SocialNetwork {
    /**
     * Create friends iterator profile iterator.
     *
     * @param profileEmail the profile email
     * @return the profile iterator
     */
    ProfileIterator createFriendsIterator(String profileEmail);

    /**
     * Create coworkers iterator profile iterator.
     *
     * @param profileEmail the profile email
     * @return the profile iterator
     */
    ProfileIterator createCoworkersIterator(String profileEmail);
}

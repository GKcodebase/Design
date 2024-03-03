package BehavioralDesignPattern.Iterator.iterators;

import BehavioralDesignPattern.Iterator.profile.Profile;

/**
 * The interface Profile iterator.
 */
public interface ProfileIterator {
    /**
     * Has next boolean.
     *
     * @return the boolean
     */
    boolean hasNext();

    /**
     * Gets next.
     *
     * @return the next
     */
    Profile getNext();

    /**
     * Reset.
     */
    void reset();
}

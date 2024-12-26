package HashMap;
import java.util.LinkedList;

/**
 * The Hash map implemenatation with List.
 *
 * @param <K> the type parameter
 * @param <V> the type parameter
 */
public class HashMap<K, V> {

    /**
     * The constant DEFAULT_CAPACITY.
     */
    private static final int DEFAULT_CAPACITY = 16;
    /**
     * The constant LOAD_FACTOR.
     */
    private static final double LOAD_FACTOR = 0.75;

    /**
     * The Buckets.
     */
    private LinkedList<Entry<K, V>>[] buckets;
    /**
     * The Capacity.
     */
    private int capacity;
    /**
     * The Size.
     */
    private int size;

    /**
     * Instantiates a new Hash map.
     */
// Constructor with default capacity
    public HashMap() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Instantiates a new Hash map.
     *
     * @param capacity the capacity
     */
// Constructor with specified capacity
    public HashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
        this.size = 0;
    }

    /**
     * The type Entry.
     *
     * @param <K> the type parameter
     * @param <V> the type parameter
     */
// Entry class to hold key-value pairs
    private static class Entry<K, V> {
        /**
         * The Key.
         */
        K key;
        /**
         * The Value.
         */
        V value;
        /**
         * The Next.
         */
        Entry<K, V> next; // Pointer to next entry

        /**
         * Instantiates a new Entry.
         *
         * @param key   the key
         * @param value the value
         */
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    /**
     * Hash int.
     *
     * @param key the key
     * @return the int
     */
// Hash function to determine index
    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    /**
     * Put.
     *
     * @param key   the key
     * @param value the value
     */
// Method to put key-value pair
    public void put(K key, V value) {
        if ((double) size / capacity >= LOAD_FACTOR) {
            resize();
        }

        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // Key already exists, update value
                return;
            }
        }
        // If key doesn't exist, add new entry
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = bucket.getFirst(); // Point to existing head
        bucket.addFirst(newEntry); // Add at the beginning of the list
        size++;
    }

    /**
     * Resize.
     */
// Resize the array when load factor is exceeded
    private void resize() {
        capacity *= 2;
        LinkedList<Entry<K, V>>[] newBuckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            newBuckets[i] = new LinkedList<>();
        }

        // Rehash all entries
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> entry : bucket) {
                int index = Math.abs(entry.key.hashCode() % capacity);
                entry.next = newBuckets[index].getFirst(); // Point to existing head
                newBuckets[index].addFirst(entry); // Add at the beginning of the list
            }
        }
        buckets = newBuckets;
    }

    /**
     * Get v.
     *
     * @param key the key
     * @return the v
     */
// Method to get value associated with key
    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; // Key not found
    }

    /**
     * Remove.
     *
     * @param key the key
     */
// Method to remove key-value pair
    public void remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        Entry<K, V> prev = null;
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                if (prev != null) {
                    prev.next = entry.next; // Update previous entry's next pointer
                } else {
                    bucket.removeFirst(); // Remove first element in the bucket
                }
                size--;
                return;
            }
            prev = entry;
        }
    }

    /**
     * Contains key boolean.
     *
     * @param key the key
     * @return the boolean
     */
// Method to check if the map contains the key
    public boolean containsKey(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Contains value boolean.
     *
     * @param value the value
     * @return the boolean
     */
// Method to check if the map contains the value
    public boolean containsValue(V value) {
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> entry : bucket) {
                if (entry.value.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Size int.
     *
     * @return the int
     */
// Method to get the size of the map
    public int size() {
        return size;
    }

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
// Method to check if the map is empty
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Clear.
     */
// Method to clear the map
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            buckets[i].clear();
        }
        size = 0;
    }
}



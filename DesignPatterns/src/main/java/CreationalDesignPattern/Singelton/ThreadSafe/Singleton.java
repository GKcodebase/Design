package CreationalDesignPattern.Singelton.ThreadSafe;

/**
 * The type Singleton.
 */
public final class Singleton {
    /**
     * The constant instance.
     */
// The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile Singleton instance;

    /**
     * The Value.
     */
    public String value;

    /**
     * Instantiates a new Singleton.
     *
     * @param value the value
     */
    private Singleton(String value) {
        this.value = value;
    }

    /**
     * Gets instance.
     *
     * @param value the value
     * @return the instance
     */
    public static Singleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
package CreationalDesignPattern.Singelton.Naive.SingleThreaded;

/**
 * The type Singleton.
 */
public final class Singleton {
    /**
     * The constant instance.
     */
    private static Singleton instance;
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
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    /**
     * Gets instance.
     *
     * @param value the value
     * @return the instance
     */
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}

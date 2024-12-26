package CheatSheet.CreationalDesignPattern;

/**
 * The Singleton.
 */
// Thread-safe Singleton with lazy initialization
public class Singleton {
    /**
     * The constant instance.
     */
    public static volatile Singleton instance;

    /**
     * Instantiates a new Singleton.
     */
// Private constructor to prevent instantiation
    private Singleton() {
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance)
                    instance = new Singleton();
            }
        }
        return instance;
    }


}

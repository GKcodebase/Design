package CreationalDesignPattern.Builder.components;

/**
 * The type Engine.
 */
public class Engine {
    /**
     * The Volume.
     */
    private final double volume;
    /**
     * The Mileage.
     */
    private double mileage;
    /**
     * The Started.
     */
    private boolean started;

    /**
     * Instantiates a new Engine.
     *
     * @param volume  the volume
     * @param mileage the mileage
     */
    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    /**
     * On.
     */
    public void on() {
        started = true;
    }

    /**
     * Off.
     */
    public void off() {
        started = false;
    }

    /**
     * Is started boolean.
     *
     * @return the boolean
     */
    public boolean isStarted() {
        return started;
    }

    /**
     * Go.
     *
     * @param mileage the mileage
     */
    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    /**
     * Gets volume.
     *
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Gets mileage.
     *
     * @return the mileage
     */
    public double getMileage() {
        return mileage;
    }
}

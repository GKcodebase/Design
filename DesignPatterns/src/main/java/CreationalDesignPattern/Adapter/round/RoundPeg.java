package CreationalDesignPattern.Adapter.round;

/**
 * The type Round peg.
 */
public class RoundPeg {
    /**
     * The Radius.
     */
    private double radius;

    /**
     * Instantiates a new Round peg.
     */
    public RoundPeg() {}

    /**
     * Instantiates a new Round peg.
     *
     * @param radius the radius
     */
    public RoundPeg(double radius) {
        this.radius = radius;
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
}

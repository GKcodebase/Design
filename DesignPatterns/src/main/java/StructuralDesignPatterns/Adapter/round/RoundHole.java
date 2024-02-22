package StructuralDesignPatterns.Adapter.round;

/**
 * The type Round hole.
 */
public class RoundHole {
    /**
     * The Radius.
     */
    private double radius;

    /**
     * Instantiates a new Round hole.
     *
     * @param radius the radius
     */
    public RoundHole(double radius) {
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

    /**
     * Fits boolean.
     *
     * @param peg the peg
     * @return the boolean
     */
    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}

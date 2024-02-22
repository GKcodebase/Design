package StructuralDesignPatterns.Adapter.square;

/**
 * The type Square peg.
 */
public class SquarePeg {
    /**
     * The Width.
     */
    private double width;

    /**
     * Instantiates a new Square peg.
     *
     * @param width the width
     */
    public SquarePeg(double width) {
        this.width = width;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Gets square.
     *
     * @return the square
     */
    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}

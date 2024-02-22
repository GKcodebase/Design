package StructuralDesignPatterns.Adapter.adapters;

import StructuralDesignPatterns.Adapter.round.RoundPeg;
import StructuralDesignPatterns.Adapter.square.SquarePeg;

/**
 * The type Square peg adapter.
 */
public class SquarePegAdapter extends RoundPeg {
    /**
     * The Peg.
     */
    private SquarePeg peg;

    /**
     * Instantiates a new Square peg adapter.
     *
     * @param peg the peg
     */
    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}

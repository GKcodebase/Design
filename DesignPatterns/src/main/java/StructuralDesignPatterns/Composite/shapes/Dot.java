package StructuralDesignPatterns.Composite.shapes;

import java.awt.*;

/**
 * The type Dot.
 */
public class Dot extends BaseShape {
    /**
     * The Dot size.
     */
    private final int DOT_SIZE = 3;

    /**
     * Instantiates a new Dot.
     *
     * @param x     the x
     * @param y     the y
     * @param color the color
     */
    public Dot(int x, int y, Color color) {
        super(x, y, color);
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    /**
     * Paint.
     *
     * @param graphics the graphics
     */
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
    }
}

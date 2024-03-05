package StructuralDesignPatterns.Composite.shapes;

import java.awt.*;

/**
 * The type Circle.
 */
public class Circle extends BaseShape {
    /**
     * The Radius.
     */
    public int radius;

    /**
     * Instantiates a new Circle.
     *
     * @param x      the x
     * @param y      the y
     * @param radius the radius
     * @param color  the color
     */
    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    @Override
    public int getWidth() {
        return radius * 2;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    @Override
    public int getHeight() {
        return radius * 2;
    }

    /**
     * Paint.
     *
     * @param graphics the graphics
     */
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}
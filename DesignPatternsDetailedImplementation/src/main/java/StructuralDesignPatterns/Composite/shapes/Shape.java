package StructuralDesignPatterns.Composite.shapes;

import java.awt.*;

/**
 * The interface Shape.
 */
public interface Shape {
    /**
     * Gets x.
     *
     * @return the x
     */
    int getX();

    /**
     * Gets y.
     *
     * @return the y
     */
    int getY();

    /**
     * Gets width.
     *
     * @return the width
     */
    int getWidth();

    /**
     * Gets height.
     *
     * @return the height
     */
    int getHeight();

    /**
     * Move.
     *
     * @param x the x
     * @param y the y
     */
    void move(int x, int y);

    /**
     * Is inside bounds boolean.
     *
     * @param x the x
     * @param y the y
     * @return the boolean
     */
    boolean isInsideBounds(int x, int y);

    /**
     * Select.
     */
    void select();

    /**
     * Un select.
     */
    void unSelect();

    /**
     * Is selected boolean.
     *
     * @return the boolean
     */
    boolean isSelected();

    /**
     * Paint.
     *
     * @param graphics the graphics
     */
    void paint(Graphics graphics);
}

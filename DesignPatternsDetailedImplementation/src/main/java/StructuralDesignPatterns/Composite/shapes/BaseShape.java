package StructuralDesignPatterns.Composite.shapes;

import java.awt.*;

/**
 * The type Base shape.
 */
abstract class BaseShape implements Shape {
    /**
     * The X.
     */
    public int x;
    /**
     * The Y.
     */
    public int y;
    /**
     * The Color.
     */
    public Color color;
    /**
     * The Selected.
     */
    private boolean selected = false;

    /**
     * Instantiates a new Base shape.
     *
     * @param x     the x
     * @param y     the y
     * @param color the color
     */
    BaseShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    @Override
    public int getX() {
        return x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    @Override
    public int getY() {
        return y;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    @Override
    public int getWidth() {
        return 0;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    @Override
    public int getHeight() {
        return 0;
    }

    /**
     * Move.
     *
     * @param x the x
     * @param y the y
     */
    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    /**
     * Is inside bounds boolean.
     *
     * @param x the x
     * @param y the y
     * @return the boolean
     */
    @Override
    public boolean isInsideBounds(int x, int y) {
        return x > getX() && x < (getX() + getWidth()) &&
                y > getY() && y < (getY() + getHeight());
    }

    /**
     * Select.
     */
    @Override
    public void select() {
        selected = true;
    }

    /**
     * Un select.
     */
    @Override
    public void unSelect() {
        selected = false;
    }

    /**
     * Is selected boolean.
     *
     * @return the boolean
     */
    @Override
    public boolean isSelected() {
        return selected;
    }

    /**
     * Enable selection style.
     *
     * @param graphics the graphics
     */
    void enableSelectionStyle(Graphics graphics) {
        graphics.setColor(Color.LIGHT_GRAY);

        Graphics2D g2 = (Graphics2D) graphics;
        float[] dash1 = {2.0f};
        g2.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f, dash1, 0.0f));
    }

    /**
     * Disable selection style.
     *
     * @param graphics the graphics
     */
    void disableSelectionStyle(Graphics graphics) {
        graphics.setColor(color);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke());
    }


    /**
     * Paint.
     *
     * @param graphics the graphics
     */
    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
        }
        else {
            disableSelectionStyle(graphics);
        }

        // ...
    }
}

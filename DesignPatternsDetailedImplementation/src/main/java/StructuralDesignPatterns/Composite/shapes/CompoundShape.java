package StructuralDesignPatterns.Composite.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Compound shape.
 */
public class CompoundShape extends BaseShape {
    /**
     * The Children.
     */
    protected List<Shape> children = new ArrayList<>();

    /**
     * Instantiates a new Compound shape.
     *
     * @param components the components
     */
    public CompoundShape(Shape... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    /**
     * Add.
     *
     * @param component the component
     */
    public void add(Shape component) {
        children.add(component);
    }

    /**
     * Add.
     *
     * @param components the components
     */
    public void add(Shape... components) {
        children.addAll(Arrays.asList(components));
    }

    /**
     * Remove.
     *
     * @param child the child
     */
    public void remove(Shape child) {
        children.remove(child);
    }

    /**
     * Remove.
     *
     * @param components the components
     */
    public void remove(Shape... components) {
        children.removeAll(Arrays.asList(components));
    }

    /**
     * Clear.
     */
    public void clear() {
        children.clear();
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    @Override
    public int getX() {
        if (children.size() == 0) {
            return 0;
        }
        int x = children.get(0).getX();
        for (Shape child : children) {
            if (child.getX() < x) {
                x = child.getX();
            }
        }
        return x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    @Override
    public int getY() {
        if (children.size() == 0) {
            return 0;
        }
        int y = children.get(0).getY();
        for (Shape child : children) {
            if (child.getY() < y) {
                y = child.getY();
            }
        }
        return y;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();
        for (Shape child : children) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();
            if (childWidth > maxWidth) {
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();
        for (Shape child : children) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    /**
     * Move.
     *
     * @param x the x
     * @param y the y
     */
    @Override
    public void move(int x, int y) {
        for (Shape child : children) {
            child.move(x, y);
        }
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
        for (Shape child : children) {
            if (child.isInsideBounds(x, y)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Un select.
     */
    @Override
    public void unSelect() {
        super.unSelect();
        for (Shape child : children) {
            child.unSelect();
        }
    }

    /**
     * Select child at boolean.
     *
     * @param x the x
     * @param y the y
     * @return the boolean
     */
    public boolean selectChildAt(int x, int y) {
        for (Shape child : children) {
            if (child.isInsideBounds(x, y)) {
                child.select();
                return true;
            }
        }
        return false;
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
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            disableSelectionStyle(graphics);
        }

        for (Shape child : children) {
            child.paint(graphics);
        }
    }
}

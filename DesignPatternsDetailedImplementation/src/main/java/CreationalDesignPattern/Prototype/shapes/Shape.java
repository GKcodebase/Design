package CreationalDesignPattern.Prototype.shapes;

import java.util.Objects;

/**
 * The type Shape.
 */
public abstract class Shape {
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
    public String color;

    /**
     * Instantiates a new Shape.
     */
    public Shape() {
    }

    /**
     * Instantiates a new Shape.
     *
     * @param target the target
     */
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    /**
     * Clone shape.
     *
     * @return the shape
     */
    public abstract Shape clone();

    /**
     * Equals boolean.
     *
     * @param object2 the object 2
     * @return the boolean
     */
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
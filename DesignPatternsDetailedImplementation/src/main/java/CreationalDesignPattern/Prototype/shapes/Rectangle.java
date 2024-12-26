package CreationalDesignPattern.Prototype.shapes;

/**
 * The type Rectangle.
 */
public class Rectangle extends Shape {
    /**
     * The Width.
     */
    public int width;
    /**
     * The Height.
     */
    public int height;

    /**
     * Instantiates a new Rectangle.
     */
    public Rectangle() {
    }

    /**
     * Instantiates a new Rectangle.
     *
     * @param target the target
     */
    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    /**
     * Clone shape.
     *
     * @return the shape
     */
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    /**
     * Equals boolean.
     *
     * @param object2 the object 2
     * @return the boolean
     */
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}

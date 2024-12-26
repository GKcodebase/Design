package CreationalDesignPattern.Prototype.shapes;

/**
 * The type Circle.
 */
public class Circle extends Shape {
    /**
     * The Radius.
     */
    public int radius;

    /**
     * Instantiates a new Circle.
     */
    public Circle() {
    }

    /**
     * Instantiates a new Circle.
     *
     * @param target the target
     */
    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    /**
     * Clone shape.
     *
     * @return the shape
     */
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    /**
     * Equals boolean.
     *
     * @param object2 the object 2
     * @return the boolean
     */
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
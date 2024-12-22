package CheatSheet.CreationalDesignPattern;

/**
 * The Factory.
 */
public class Factory {
    /**
     * The interface Shape.
     */
    interface Shape {
        /**
         * Draw.
         */
        void draw();
    }

    /**
     * The type Rectangle.
     */
    class Rectangle implements Shape {
        /**
         * Draw.
         */
        @Override
        public void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    /**
     * The type Circle.
     */
    class Circle implements Shape {
        /**
         * Draw.
         */
        @Override
        public void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    /**
     * The type Shape factory.
     */
    class ShapeFactory {
        /**
         * Create shape shape.
         *
         * @param shapeType the shape type
         * @return the shape
         */
        public Shape createShape(String shapeType) {
            if (null == shapeType)
                return null;

            switch (shapeType) {
                case "Rectangle":
                    return new Rectangle();
                case "Circle":
                    return new Circle();

                default:
                    throw new IllegalArgumentException("Unknown Exception");
            }
        }
    }
}

package BehaviourialDesignPattern;

import java.util.Arrays;
import java.util.List;

/**
 * The type Visitor.
 */
public class Visitor {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
// Usage
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(5),
                new Rectangle(4, 3)
        );

        AreaCalculator calculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(calculator);
        }

        System.out.println("Total area: " + calculator.getTotalArea());
    }

    /**
     * The interface Shape.
     */
// Element interface
    interface Shape {
        /**
         * Accept.
         *
         * @param visitor the visitor
         */
        void accept(ShapeVisitor visitor);
    }

    /**
     * The interface Shape visitor.
     */
// Visitor interface
    interface ShapeVisitor {
        /**
         * Visit.
         *
         * @param circle the circle
         */
        void visit(Circle circle);

        /**
         * Visit.
         *
         * @param rectangle the rectangle
         */
        void visit(Rectangle rectangle);
    }

    /**
     * The type Circle.
     */
// Concrete elements
    static class Circle implements Shape {
        /**
         * The Radius.
         */
        private final double radius;

        /**
         * Instantiates a new Circle.
         *
         * @param radius the radius
         */
        public Circle(double radius) {
            this.radius = radius;
        }

        /**
         * Gets radius.
         *
         * @return the radius
         */
        public double getRadius() {
            return radius;
        }

        /**
         * Accept.
         *
         * @param visitor the visitor
         */
        @Override
        public void accept(ShapeVisitor visitor) {
            visitor.visit(this);
        }
    }

    /**
     * The type Rectangle.
     */
    static class Rectangle implements Shape {
        /**
         * The Length.
         */
        private final double length;
        /**
         * The Width.
         */
        private final double width;

        /**
         * Instantiates a new Rectangle.
         *
         * @param length the length
         * @param width  the width
         */
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        /**
         * Gets length.
         *
         * @return the length
         */
        public double getLength() {
            return length;
        }

        /**
         * Gets width.
         *
         * @return the width
         */
        public double getWidth() {
            return width;
        }

        /**
         * Accept.
         *
         * @param visitor the visitor
         */
        @Override
        public void accept(ShapeVisitor visitor) {
            visitor.visit(this);
        }
    }

    /**
     * The type Area calculator.
     */
// Concrete visitor
    static class AreaCalculator implements ShapeVisitor {
        /**
         * The Total area.
         */
        private double totalArea = 0;

        /**
         * Visit.
         *
         * @param circle the circle
         */
        @Override
        public void visit(Circle circle) {
            totalArea += Math.PI * circle.getRadius() * circle.getRadius();
        }

        /**
         * Visit.
         *
         * @param rectangle the rectangle
         */
        @Override
        public void visit(Rectangle rectangle) {
            totalArea += rectangle.getLength() * rectangle.getWidth();
        }

        /**
         * Gets total area.
         *
         * @return the total area
         */
        public double getTotalArea() {
            return totalArea;
        }
    }


}

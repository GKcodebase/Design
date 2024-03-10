package Polymorphism;

/**
 * The type Shape.
 */
// Class definition for Shape
abstract class Shape {
    /**
     * Area double.
     *
     * @return the double
     */
    abstract double area();
}

/**
 * The type Rectangle.
 */
// Class definition for Rectangle, subclass of Shape
class Rectangle extends Shape {
    /**
     * The Width.
     */
    double width;
    /**
     * The Height.
     */
    double height;

    /**
     * Instantiates a new Rectangle.
     *
     * @param width  the width
     * @param height the height
     */
// Constructor
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Area double.
     *
     * @return the double
     */
// Method to calculate area
    @Override
    double area() {
        return width * height;
    }
}

/**
 * The type Circle.
 */
// Class definition for Circle, subclass of Shape
class Circle extends Shape {
    /**
     * The Radius.
     */
    double radius;

    /**
     * Instantiates a new Circle.
     *
     * @param radius the radius
     */
// Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Area double.
     *
     * @return the double
     */
// Method to calculate area
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
// Main method
    public static void main(String[] args) {
        // Calculating areas
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        System.out.println(rectangle.area());  // Output: 20.0
        System.out.println(circle.area());     // Output: 28.274333882308138
    }
}


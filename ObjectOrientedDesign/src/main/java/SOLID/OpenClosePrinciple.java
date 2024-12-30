package SOLID;
/**
 * Software entities (classes, modules, functions) should be open for extension but closed for modification.
 * */
public class OpenClosePrinciple {
    // Example violating OCP
    abstract class Rectangle {
        public double area(double length, double width) {
            return length * width;
        }

        public abstract double area(double side);
    }

    // Extending Rectangle without modifying it
    class Square extends Rectangle {
        @Override
        public double area(double side) {
            return side * side;
        }
    }

}

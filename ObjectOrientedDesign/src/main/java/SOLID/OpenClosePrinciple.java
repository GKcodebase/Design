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
    }
    // Extending Rectangle  and  modifying are
    class Square extends Rectangle {
        public double area(double side) {
            return side * side;
        }
    }

    // OCP Strategy  Use proper abstraction (most common & clean)
    interface Shape {
        double area();           // closed for modification
    }

    // Now we can add any new shape without touching existing code
    class Rectangleocp implements Shape {
        private double length;
        private double width;

        public Rectangleocp(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }
    }

    class Squareocp implements Shape {
        private double side;

        public Squareocp(double side) {
            this.side = side;
        }

        @Override
        public double area() {
            return side * side;
        }
    }

}



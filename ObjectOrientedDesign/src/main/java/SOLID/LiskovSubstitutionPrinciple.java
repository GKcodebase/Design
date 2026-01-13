package SOLID;

/**
 * Subtypes must be substitutable for their base types without affecting the correctness of the program.
 * **/
public class LiskovSubstitutionPrinciple {

    // Example violating LSP (classic Rectangle-Square problem)
    static class Rectangle {
        protected int width;
        protected int height;

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int area() {
            return width * height;
        }
    }

    static class Square extends Rectangle {
        @Override
        public void setWidth(int width) {
            this.width = width;
            this.height = width;   // Forces height = width
        }

        @Override
        public void setHeight(int height) {
            this.height = height;
            this.width = height;   // Forces width = height
        }
    }

    // Fixed version - separate classes implementing a common interface (recommended)
    interface Shape {
        int area();
    }

    static class RectangleFixed implements Shape {
        private int width;
        private int height;

        public RectangleFixed(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public void setWidth(int width)   { this.width = width; }
        public void setHeight(int height) { this.height = height; }

        @Override
        public int area() {
            return width * height;
        }
    }

    static class SquareFixed implements Shape {
        private int side;

        public SquareFixed(int side) {
            this.side = side;
        }

        public void setSide(int side) {
            this.side = side;
        }

        @Override
        public int area() {
            return side * side;
        }
    }

    // One-liner usage example showing the violation vs fixed behavior
    public static void main(String[] args) {
        // Violating version - unexpected result when treating Square as Rectangle
        Rectangle r = new Square();
        r.setWidth(5); r.setHeight(10);                // Area should be 50, but becomes 100!

        // Fixed version - safe and predictable
        Shape rect = new RectangleFixed(5, 10);        // Area = 50
        Shape sq   = new SquareFixed(5);               // Area = 25
    }
}
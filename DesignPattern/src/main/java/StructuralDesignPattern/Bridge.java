package StructuralDesignPattern;

/**
 * The Bridge.
 */
public class Bridge {
    /**
     * The interface Draw api.
     */
// Implementation
    interface DrawAPI {
        /**
         * Draw circle.
         *
         * @param x      the x
         * @param y      the y
         * @param radius the radius
         */
        void drawCircle(int x, int y, int radius);
    }

    /**
     * The type Shape.
     */
// Abstraction
    abstract class Shape {
        /**
         * The Draw api.
         */
        protected DrawAPI drawAPI;

        /**
         * Instantiates a new Shape.
         *
         * @param drawAPI the draw api
         */
        protected Shape(DrawAPI drawAPI) {
            this.drawAPI = drawAPI;
        }

        /**
         * Draw.
         */
        abstract void draw();
    }

    /**
     * The type Red circle.
     */
    class RedCircle implements DrawAPI {

        /**
         * Draw circle.
         *
         * @param x      the x
         * @param y      the y
         * @param radius the radius
         */
        @Override
        public void drawCircle(int x, int y, int radius) {
            System.out.println("Drawing Circle [color: red, x: " + x + ", y: " + y + ", radius: " + radius + "]");
        }
    }

    /**
     * The type Blue circle.
     */
    class BlueCircle implements DrawAPI {

        /**
         * Draw circle.
         *
         * @param x      the x
         * @param y      the y
         * @param radius the radius
         */
        @Override
        public void drawCircle(int x, int y, int radius) {
            System.out.println("Drawing Circle [color: blue, x: " + x + ", y: " + y + ", radius: " + radius + "]");
        }
    }

    /**
     * The type Circle.
     */
    class Circle extends Shape {

        /**
         * The X.
         */
        private final int x;
        /**
         * The Y.
         */
        private final int y;
        /**
         * The Radius.
         */
        private final int radius;

        /**
         * Instantiates a new Circle.
         *
         * @param x       the x
         * @param y       the y
         * @param radius  the radius
         * @param drawAPI the draw api
         */
        public Circle(int x, int y, int radius, DrawAPI drawAPI) {
            super(drawAPI);
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        /**
         * Draw.
         */
        @Override
        void draw() {
            drawAPI.drawCircle(x, y, radius);
        }
    }
}

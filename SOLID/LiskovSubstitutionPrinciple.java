package SOLID;

/**
 * Subtypes must be substitutable for their base types without affecting the correctness of the program.
 * **/
public class LiskovSubstitutionPrinciple {
    // Example violating LSP
    class Rectangle {
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

    class Square extends Rectangle {
        @Override
        public void setWidth(int width) {
            this.width = width;
            this.height = width;
        }

        @Override
        public void setHeight(int height) {
            this.height = height;
            this.width = height;
        }
    }

}

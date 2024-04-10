package SOLID;

/**
 * Clients should not be forced to depend on methods they do not use. Interfaces should be specific to the client's needs.
 * */
public class InterfaceSegregation {
    // Example violating ISP
    interface Worker {
        void work();
        void eat();
    }

    class Robot implements Worker {
        @Override
        public void work() {
            // Code for robot to work
        }

        @Override
        public void eat() {
            // Robots don't eat, unnecessary method for them
        }
    }

    // Refactored into segregated interfaces
    interface Workable {
        void work();
    }

    interface Feedable {
        void eat();
    }

    class Robot implements Workable {
        @Override
        public void work() {
            // Code for robot to work
        }
    }

}

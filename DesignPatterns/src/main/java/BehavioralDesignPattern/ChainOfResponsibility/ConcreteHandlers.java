package BehavioralDesignPattern.ChainOfResponsibility;

/**
 * The type Concrete handlers.
 */
public class ConcreteHandlers {

    /**
     * The type Info logger.
     */
    static class InfoLogger extends Logger {
        /**
         * Instantiates a new Info logger.
         *
         * @param level the level
         */
        public InfoLogger(int level) {
            this.level = level;
        }

        /**
         * Write.
         *
         * @param message the message
         */
        @Override
        protected void write(String message) {
            System.out.println("INFO: " + message);
        }
    }

    /**
     * The type Debug logger.
     */
    static class DebugLogger extends Logger {
        /**
         * Instantiates a new Debug logger.
         *
         * @param level the level
         */
        public DebugLogger(int level) {
            this.level = level;
        }

        /**
         * Write.
         *
         * @param message the message
         */
        @Override
        protected void write(String message) {
            System.out.println("DEBUG: " + message);
        }
    }

    /**
     * The type Error logger.
     */
    static class ErrorLogger extends Logger {
        /**
         * Instantiates a new Error logger.
         *
         * @param level the level
         */
        public ErrorLogger(int level) {
            this.level = level;
        }

        /**
         * Write.
         *
         * @param message the message
         */
        @Override
        protected void write(String message) {
            System.out.println("ERROR: " + message);
        }
    }


}

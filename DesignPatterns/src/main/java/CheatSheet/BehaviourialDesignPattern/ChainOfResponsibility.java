package CheatSheet.BehaviourialDesignPattern;

/**
 * The Chain of responsibility.
 */
public class ChainOfResponsibility {
    /**
     * The type Logger.
     */
// Abstract Logger
    abstract class Logger{
        /**
         * The constant INFO.
         */
        public static final int INFO =1;
        /**
         * The constant DEBUG.
         */
        public static final int DEBUG =2;
        /**
         * The constant ERROR.
         */
        public static final int ERROR =3;

        /**
         * The Level.
         */
        protected int level;
        /**
         * The Next logger.
         */
        protected Logger nextLogger;

        /**
         * Set next logger.
         *
         * @param logger the logger
         */
        public void setNextLogger(Logger logger){
            this.nextLogger = logger;
        }

        /**
         * Log message.
         *
         * @param level   the level
         * @param message the message
         */
        public void logMessage(int level, String message){
            if(this.level == level)
                write(message);
            if (nextLogger != null) {
                nextLogger.logMessage(level, message);
            }
        }

        /**
         * Write.
         *
         * @param message the message
         */
        protected abstract void write(String message);

    }

    /**
     * The type Console logger.
     */
//Concrete Handler
    class ConsoleLogger extends Logger{

        /**
         * Instantiates a new Console logger.
         *
         * @param level the level
         */
        public ConsoleLogger(int level){
            this.level = level;
        }

        /**
         * Write.
         *
         * @param message the message
         */
        @Override
        protected void write(String message) {
            System.out.println("Console Logger: " + message);
        }
    }

    /**
     * The type File logger.
     */
    class FileLogger extends Logger{
        /**
         * Instantiates a new File logger.
         *
         * @param level the level
         */
        public FileLogger (int level){
            this.level = level;
        }

        /**
         * Write.
         *
         * @param message the message
         */
        @Override
        protected void write(String message) {
            System.out.println("File Logger: " + message);
        }
    }

    /**
     * The type Error logger.
     */
    class ErrorLogger extends Logger{
        /**
         * Instantiates a new Error logger.
         *
         * @param level the level
         */
        public ErrorLogger (int level){
            this.level = level;
        }

        /**
         * Write.
         *
         * @param message the message
         */
        @Override
        protected void write(String message) {
            System.out.println("File Logger: " + message);
        }
    }
}

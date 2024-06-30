package BehavioralDesignPattern.ChainOfResponsibility;

/**
 * The type Logger.
 */
public abstract class Logger {
    /**
     * The constant INFO.
     */
    public static final int INFO = 1;
    /**
     * The constant DEBUG.
     */
    public static final int DEBUG = 2;
    /**
     * The constant ERROR.
     */
    public static final int ERROR = 3;

    /**
     * The Level.
     */
    protected int level =0;
    /**
     * The Next logger.
     */
    protected Logger nextLogger;

    /**
     * Set logger.
     *
     * @param nextLogger the next logger
     */
    public void setNextLogger(Logger nextLogger){
        this.nextLogger=nextLogger;
    }

    /**
     * Log message.
     *
     * @param level   the level
     * @param message the message
     */
    public void logMessage(int level , String message){
        if(this.level == level){
            write(message);
        }else if(nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }

    /**
     * Write message.
     *
     * @param message the message
     */
    protected abstract void write(String message);
}

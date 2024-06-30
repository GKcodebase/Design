package BehavioralDesignPattern.ChainOfResponsibility;

public class ChainOfResponsibilityPattern {
    private static Logger getChainOfLoggers() {
        Logger errorLogger = new ConcreteHandlers.ErrorLogger(Logger.ERROR);
        Logger debugLogger = new ConcreteHandlers.DebugLogger(Logger.DEBUG);
        Logger infoLogger = new ConcreteHandlers.InfoLogger(Logger.INFO);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();
        
        loggerChain.logMessage(Logger.ERROR, "This is an ERROR message.");
        loggerChain.logMessage(Logger.INFO, "This is an INFO message.");
        loggerChain.logMessage(Logger.DEBUG, "This is a DEBUG message.");
        loggerChain.logMessage(Logger.DEBUG, "This is another DEBUG message.");
    }
}


public class Main {
    public static void main(String[] args) {
        loggerHandler chain = chainLoggerHandlers();

        chain.logMessage("Software started work", MessageType.INFO);
        chain.logMessage("Debug starting... ", MessageType.DEBUG);
        chain.logMessage("Critical ERROR ", MessageType.ERROR);

    }
    public static loggerHandler chainLoggerHandlers(){
        loggerHandler info = new InfoLogger();
        loggerHandler debug = new DebugLogger();
        loggerHandler error = new ErrorLogger();

        info.setNextHandler(debug);
        debug.setNextHandler(error);

        return info;
    }
}
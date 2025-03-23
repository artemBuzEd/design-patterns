public abstract class loggerHandler {
    protected loggerHandler nextHandler;

    public void setNextHandler(loggerHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void logMessage(String message, MessageType type);
}

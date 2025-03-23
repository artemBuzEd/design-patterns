public class ErrorLogger extends loggerHandler{

    @Override
    public void logMessage(String message, MessageType type) {
        if(type == MessageType.ERROR){
            System.out.println(message + " [logged by ErrorLogger]");
        } else {
            System.out.println(message + " [don't logged by ErrorLogger, needed other logger]");
            if(nextHandler != null){
                nextHandler.logMessage(message, type);
            }
        }
    }
}

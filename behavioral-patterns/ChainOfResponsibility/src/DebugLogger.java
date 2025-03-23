public class DebugLogger extends loggerHandler {

    @Override
    public void logMessage(String message, MessageType type) {
        if(type == MessageType.DEBUG){
            System.out.println(message + " [logged by DebugLogger]");
        } else{
            System.out.println(message + " [don't logged by DebugLogger, needed other logger]");
            if(nextHandler != null){
                nextHandler.logMessage(message, type);
            }
        }
    }
}

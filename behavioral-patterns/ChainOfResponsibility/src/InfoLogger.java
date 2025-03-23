public class InfoLogger extends loggerHandler {

    @Override
    public void logMessage(String message, MessageType type) {
        if(type == MessageType.INFO) {
            System.out.println(message + " [logged by InfoLogger]");
        } else{
            System.out.println(message + " [don't logged by InfoLogger, needed other logger]");
            if(nextHandler != null){
                nextHandler.logMessage(message, type);
            }
        }
    }
}

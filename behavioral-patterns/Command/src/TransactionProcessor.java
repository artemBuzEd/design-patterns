public class TransactionProcessor {
    TransactionCommand command;

    public TransactionProcessor(TransactionCommand command) {
        this.command = command;
    }

    public void setCommand(TransactionCommand command) {
        this.command = command;
    }

    public void invoke(){
        command.execute();
    }
}

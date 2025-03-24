public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Bank Account1", 1000);
        BankAccount account2 = new BankAccount("Bank Account2", 5000);

        TransactionCommand deposit = new DepositeCommand(account1,200);
        TransactionCommand withdraw = new WithdrawCommand(account2,500);
        TransactionCommand transfer = new TransferCommand(account2,account1,2000);

        TransactionProcessor tp = new TransactionProcessor(deposit);
        tp.invoke();

        tp.setCommand(withdraw);
        tp.invoke();

        tp.setCommand(transfer);
        tp.invoke();
    }
}
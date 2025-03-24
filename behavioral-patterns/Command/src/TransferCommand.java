public class TransferCommand implements TransactionCommand {
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;
    private boolean isSuccessful;

    public TransferCommand(BankAccount fromAccount, BankAccount toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        isSuccessful = false;
    }

    @Override
    public void execute() {
        if(fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println(fromAccount.getAccountNumber() + " transfer: " + amount + " to " + toAccount.getAccountNumber());
            System.out.println(fromAccount.getBalance() + "$ on fromAccount");
            System.out.println(toAccount.getBalance() + "$ on toAccount ");
            isSuccessful = true;
        } else{
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void undo() {
        if(isSuccessful){
            fromAccount.deposit(amount);
            toAccount.withdraw(amount);
        }
    }
}

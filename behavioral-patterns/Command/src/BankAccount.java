public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " to " + accountNumber);
        System.out.println("Balance: " + this.balance);
    }

    public void withdraw(double amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn " + amount + " from " + accountNumber);
            System.out.println("Balance: " + this.balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
}

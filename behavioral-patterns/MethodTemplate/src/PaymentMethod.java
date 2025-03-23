public abstract class PaymentMethod {
    public final void pay(double amount) {
        userAuthenticate();
        if(processPayment(amount)){
            sendConfirmation();
        }
    }

    public abstract void userAuthenticate();
    public abstract boolean validateFunds(double amount);
    public abstract boolean processPayment(double amount);
    private void sendConfirmation(){
        System.out.println("Payment sent successfully");
    }
}

public class PayPalPayment extends PaymentMethod{
    @Override
    public void userAuthenticate() {
        System.out.println("Logging in your PayPal Account...");
    }

    @Override
    public boolean validateFunds(double amount) {
        System.out.println("Checking PayPal balance, please wait...");
        if(amount > 0 && amount <= 50){
            System.out.println("PayPal Balance is valid");
            return true;
        }
        return false;
    }

    @Override
    public boolean processPayment(double amount) {
        if(validateFunds(amount)){
            System.out.println(amount +"$ was sent from your PayPal account");
            return true;
        } else {
            System.out.println(amount +"$ was not sent from your PayPal account, try again later");
        }
        return false;
    }
}

public class CreditCardPayment extends PaymentMethod {

    @Override
    public void userAuthenticate() {
        System.out.println("User authentication, please wait...");
    }

    @Override
    public boolean validateFunds(double amount) {
        System.out.println("Checking credit card balance, please wait...");
        if(amount > 0 && amount <= 100) {
            System.out.println("Credit Card Payment is valid");
            return true;
        }
        return false;
    }

    @Override
    public boolean processPayment(double amount) {
        if(validateFunds(amount)){
            System.out.println(amount +"$ was sent from your credit card account");
            return true;
        } else {
            System.out.println(amount +"$ was not sent from your credit card account, try again later");
        }
        return false;
    }
}

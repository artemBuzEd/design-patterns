public class CryptoPayment extends PaymentMethod{

    @Override
    public void userAuthenticate(){
        System.out.println("Verifying crypto wallet, please wait...");
    }

    @Override
    public boolean validateFunds(double amount){
        System.out.println("Validating the crypto wallet, please wait...");
        if(amount > 0 && amount <= 1000){
            System.out.println("Crypto wallet validated");
            return true;
        }
        return false;
    }

    @Override
    public boolean processPayment(double amount){
        if(validateFunds(amount)){
            System.out.println(amount +"$ was sent from your crypto wallet");
            return true;
        } else {
            System.out.println(amount +"$ was not sent from your crypto wallet, try again later");
        }
        return false;
    }
}

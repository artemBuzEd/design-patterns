public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        creditCard.pay(10);

        System.out.println("=============================");

        PaymentMethod payPal = new PayPalPayment();
        payPal.pay(40);

        System.out.println("=============================");

        PaymentMethod cryptoWallet = new CryptoPayment();
        cryptoWallet.pay(2000);
    }
}
public class Main {
    public static void main(String[] args) {
        StockMarket sm = new StockMarket("Example1", 1000);
        StockMarket sm2 = new StockMarket("Example2", 500);

        Investor i1 = new Investor("John");
        Investor i2 = new Investor("Doe");

        sm.addObserver(i1);
        sm.addObserver(i2);

        sm2.addObserver(i1);

        sm.setPrice(200.0);
        sm2.setPrice(800.0);
    }
}
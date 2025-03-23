public class Investor implements StockObserver {
    private final String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price, String stockName) {
        System.out.println("Investor: " + name + " received stock: " + stockName + " price now is: " + price + "$");
    }
}

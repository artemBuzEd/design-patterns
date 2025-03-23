import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Observer {
    private String name;
    private double price;
    private List<StockObserver> observers = new ArrayList<>();

    public StockMarket(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }

    public void setPrice(double price) {
        this.price = price;
        notifyObserver();
    }
    @Override
    public void  addObserver(StockObserver observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for (StockObserver observer : observers) {
            observer.update(price, name);
        }
    }
}

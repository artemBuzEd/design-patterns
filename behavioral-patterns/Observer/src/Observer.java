public interface Observer {
    public void addObserver(StockObserver observer);
    public void removeObserver(StockObserver observer);
    public void notifyObserver();
}

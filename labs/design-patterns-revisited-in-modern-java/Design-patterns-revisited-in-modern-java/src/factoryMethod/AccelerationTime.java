package factoryMethod;

public interface AccelerationTime {
    double accelerationFrom0To100();
    int getHorsePower();
    void print();

    default void printResult() {
        System.out.println( this.getClass().getSimpleName() + " with " + this.getHorsePower() +" horse power, acceleration 0-100 " + accelerationFrom0To100());
    }
}

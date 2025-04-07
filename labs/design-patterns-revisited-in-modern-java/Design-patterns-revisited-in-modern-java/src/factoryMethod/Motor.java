package factoryMethod;

public class Motor {
    private final int horsePower;

    public Motor(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() { return horsePower; }
}

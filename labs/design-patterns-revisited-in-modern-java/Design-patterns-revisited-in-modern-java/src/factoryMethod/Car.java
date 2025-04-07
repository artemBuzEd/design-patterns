package factoryMethod;

public class Car {
    protected Motor motor;
    protected int weightKg;

    protected Car (Motor motor, int weightKg) {
        this.motor = motor;
        this.weightKg = weightKg;
    }
}

package factoryMethod.cars;

import factoryMethod.AccelerationTime;
import factoryMethod.Car;
import factoryMethod.Motor;

public class Audi extends Car implements AccelerationTime {
    private final double RS = 1.2;
    public Audi (Motor motor, int weightKg) {
        super(motor, weightKg);
    }

    @Override
    public double accelerationFrom0To100() {
        double baseConstant = 150;
        double powerToWeight = (double) motor.getHorsePower() / weightKg;

        return Math.round((baseConstant / (powerToWeight * RS)) * 100.0) / 100.0 / 100;
    }

    @Override
    public int getHorsePower() { return motor.getHorsePower(); }

    @Override
    public void print() {
        this.printResult();
    }
}

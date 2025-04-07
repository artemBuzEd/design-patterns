package factoryMethod.cars;

import factoryMethod.AccelerationTime;
import factoryMethod.Car;
import factoryMethod.Motor;

public class BMW extends Car implements AccelerationTime {
    private final double MPerformance = 1.25;
    public BMW (Motor motor, int weight) {
        super(motor, weight);
    }

    @Override
    public double accelerationFrom0To100() {
        double baseConstant = 140;
        double powerToWeight = (double) motor.getHorsePower() / weightKg;

        return Math.round((baseConstant / (powerToWeight * MPerformance)) * 100.0) / 100.0 / 100;
    }

    @Override
    public int getHorsePower() { return motor.getHorsePower(); }

    @Override
    public void print() {
        this.printResult();
    }
}

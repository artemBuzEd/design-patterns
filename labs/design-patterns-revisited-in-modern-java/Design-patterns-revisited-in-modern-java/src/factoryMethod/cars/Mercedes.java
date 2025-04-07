package factoryMethod.cars;

import factoryMethod.AccelerationTime;
import factoryMethod.Car;
import factoryMethod.Motor;

public class Mercedes extends Car implements AccelerationTime {
    private final double AMG = 1.3;
    public Mercedes(Motor motor, int weightKg) {
        super(motor, weightKg);
    }

    @Override
    public double accelerationFrom0To100() {
        double baseConstant = 160;
        double powerToWeight = (double) motor.getHorsePower() / weightKg;

        return Math.round((baseConstant / (powerToWeight * AMG)) * 100.0) / 100.0 / 100;
    }

    @Override
    public int getHorsePower() { return motor.getHorsePower(); }

    @Override
    public void print() {
        this.printResult();
    }
}

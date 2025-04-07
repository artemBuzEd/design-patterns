package strategy;

public class Package {
    private final double weightKg;
    private final double cost;

    public Package(double weightKg, double cost) {
        this.weightKg = weightKg;
        this.cost = cost;
    }

    public double getWeightKg() { return weightKg; }
    public double getCost() { return cost; }

    @Override
    public String toString() {
        return "Package [weightKg=" + weightKg + ", cost=" + cost + "]";
    }

}

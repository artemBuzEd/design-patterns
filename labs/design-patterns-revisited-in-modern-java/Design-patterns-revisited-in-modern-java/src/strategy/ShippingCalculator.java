package strategy;
import java.util.function.*;

public class ShippingCalculator {
    public double calculateShipping(Package pkg,Function<Package, Double> shippingBy) {
        if(shippingBy==null || pkg==null){
            throw new IllegalArgumentException("package and shipping variant are required");
        }

        double cost = shippingBy.apply(pkg);
        if(cost > 0){
            return cost;
        } else {
            throw new IllegalArgumentException("Package shipping cost is less or equal to 0");
        }
    }

    public static Double byPlaneStandard(Package pkg) {
        return 5.0 + ((pkg.getWeightKg() * 0.3) + (pkg.getCost() * 0.1));
    }

    public static Double byPlaneExpress(Package pkg) {
        return 7.0 + ((pkg.getWeightKg() * 0.5) + (pkg.getCost() * 0.3));
    }

    public static Double byShipStandard(Package pkg) {
        return 1.0 + ((pkg.getWeightKg() * 0.2) + (pkg.getCost() * 0.05));
    }

    public static Double byShipExpress(Package pkg) {
        return 2.0 + ((pkg.getWeightKg() * 0.3) + (pkg.getCost() * 0.1));
    }
}

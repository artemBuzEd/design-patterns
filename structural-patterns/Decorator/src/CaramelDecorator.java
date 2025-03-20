public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "caramel";
    }
}

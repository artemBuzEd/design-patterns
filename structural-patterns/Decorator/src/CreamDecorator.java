public class CreamDecorator extends CoffeeDecorator{
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " cream";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 3;
    }
}

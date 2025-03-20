public class Main {
    public static void main(String[] args) {
        Coffee basicCoffee = new SimpleCoffee();
        System.out.println(basicCoffee.getDescription() + " " + basicCoffee.getCost());

        Coffee creamCoffee = new CreamDecorator(basicCoffee);
        System.out.println(creamCoffee.getDescription() + " " + creamCoffee.getCost());

        Coffee caramelCoffee = new CreamDecorator(creamCoffee);
        System.out.println(caramelCoffee.getDescription() + " " + caramelCoffee.getCost());

        Coffee milkCoffee = new MilkDecorator(creamCoffee);
        System.out.println(milkCoffee.getDescription() + " " + milkCoffee.getCost());
    }
}
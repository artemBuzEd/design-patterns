public class Character {
    private final String name;
    private Movement moveStrategy;

    public Character(String name) {
        this.name = name;
        this.moveStrategy = new Walk();
    }

    public void addMoveStrategy(Movement moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void move() {
        System.out.print(name + " ");
        moveStrategy.move();
    }
}

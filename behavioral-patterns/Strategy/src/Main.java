public class Main {
    public static void main(String[] args) {
        Character user = new Character("Diablo");

        user.move();

        Movement run = new Run();
        user.addMoveStrategy(run);

        user.move();

        Movement swim = new Swim();
        user.addMoveStrategy(swim);

        user.move();

        Movement stealth = new Stealth();
        user.addMoveStrategy(stealth);

        user.move();
    }
}
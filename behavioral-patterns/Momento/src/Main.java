public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        PlayerMomentoCaretaker caretaker = new PlayerMomentoCaretaker();

        System.out.println(" Initial Game State:");
        System.out.println(player);

        caretaker.saveState(player);
        System.out.println("\n Game state saved!\n");

        player.play();
        System.out.println(" Player continued playing...");
        System.out.println(player);
        
        caretaker.loadState(player);
        System.out.println("\n Game restored to previous save:");
        System.out.println(player);
    }
}
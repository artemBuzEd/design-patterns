import java.util.List;

public class Main {
    public static void main(String[] args) {
        Media reel1 = new ReelsProxy("Dance Video", "Alice");
        Media reel2 = new ReelsProxy("Cooking Tutorial", "Bob");
        Media reel3 = new ReelsProxy("Gaming Clip", "Charlie");

        System.out.println("First plays:");
        reel1.play();
        reel2.play();
        reel3.play();

        System.out.println("\nReplaying some videos:");
        reel1.play();

        // Add more to test cache limit
        Media reel4 = new ReelsProxy("Travel Vlog", "Dave");
        Media reel5 = new ReelsProxy("DIY Project", "Eve");
        Media reel6 = new ReelsProxy("Fitness Tips", "Frank");

        System.out.println("\nAdding more videos:");
        reel4.play();
        reel5.play();
        reel6.play();
        
        System.out.println("\nReplay first video:");
        reel1.play();
    }
}
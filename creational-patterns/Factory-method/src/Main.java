public class Main {
    public static void main(String[] args) {
        System.out.println("=== Start Game Enemy ===");
        Enemy startEnemy = EnemyFactory.createEnemy(GameProgress.startGame);
        startEnemy.attack();
        startEnemy.defend();
        
        System.out.println("\n=== Mid Game Enemy ===");
        Enemy midEnemy = EnemyFactory.createEnemy(GameProgress.midGame);
        midEnemy.attack();
        midEnemy.defend();

        System.out.println("\n=== Late Game Enemy ===");
        Enemy lateEnemy = EnemyFactory.createEnemy(GameProgress.lateGame);
        lateEnemy.attack();
        lateEnemy.defend();

    }
}
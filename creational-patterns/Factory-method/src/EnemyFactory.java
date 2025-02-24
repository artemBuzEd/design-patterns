public class EnemyFactory {
    public static Enemy createEnemy(GameProgress progress){
        switch (progress) {
            case GameProgress.startGame:
                return new Skeleton();
            case GameProgress.midGame:
                return new Goblin();
            case GameProgress.lateGame:
                return new Troll();
            default:
                throw new IllegalArgumentException("No enemy defined for " + progress);
        }
    }
}

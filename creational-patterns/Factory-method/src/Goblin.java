import java.util.Random;

public class Goblin implements Enemy{
    public int health;

    public Goblin(){
        health = 110;
    }
    @Override
    public void attack(){
        Random random = new Random();
        int stealCoinsChance = random.nextInt(100);
        if(stealCoinsChance <= 10) {
            System.out.println("Goblin attacks you and steal some gold coins");
        } else{
            System.out.println("You got attacked by goblin");
        }
    }

    @Override
    public void defend(){
        Random random = new Random();
        int dodgeAttackChance = random.nextInt(100);
        if(dodgeAttackChance <= 20){
            System.out.println("Goblin dodged an attack and received reduced damage");
            health -=20;
        } else {
            System.out.println("Goblin has been damaged");
            health -= 35;
        }
    }
}

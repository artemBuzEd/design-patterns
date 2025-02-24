import java.util.Random;

public class Troll implements Enemy{
    public int health;

    public Troll(){
        health = 200;
    }
    public void attack(){
        Random random = new Random();
        int attackBoost = random.nextInt(100);
        if(attackBoost <= 15) {
            System.out.println("Troll attacks you with x1.5 damage");
        } else{
            System.out.println("You got attacked by troll");
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
            System.out.println("Troll has been damaged");
            health -= 35;
        }
    }
}

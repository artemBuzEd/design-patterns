import java.util.Random;

public class Skeleton implements Enemy {
    private int health;
    private final boolean hasWeapon;

    public Skeleton() {
        health = 100;
        Random random = new Random();
        hasWeapon = random.nextBoolean();
    }

    @Override
    public void attack(){
        if(hasWeapon) {
            System.out.println("You got attacked by knight skeleton with sword");
        } else{
            System.out.println("You got attacked by skeleton");
        }
    }

    @Override
    public void defend(){
        if(hasWeapon){
            System.out.println("Skeleton repelled your attack by sword");
        } else {
            System.out.println("Skeleton could not defend and get damage");
            health -= 20;
        }
    }
}
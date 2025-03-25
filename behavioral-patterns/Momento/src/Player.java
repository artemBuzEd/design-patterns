import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    private int health;
    private int gameProgress;
    private List<Items> itemsInPocket;

    public Player() {
        this.health = 100;
        this.gameProgress = (int)(Math.random()*51);
        this.itemsInPocket = new ArrayList<Items>();
        lootItems();
    }

    public int getHealth() { return health; }
    public int getGameProgress() { return gameProgress; }
    public List<Items> getItemsInPocket() { return itemsInPocket; }
    public Items getItemInPocket(int i) { return itemsInPocket.get(i); }


    public void play(){
        gameProgress += (int)(Math.random()*10);
        lootItems();
    }

    private void lootItems(){
        for(int i = 0; i < 2; i++){
            int r = new Random().nextInt(Items.values().length);
            Items item = Items.values()[r];
            itemsInPocket.add(item);
        }
    }

    public PlayerMomento save(){
        return new PlayerMomento(health, gameProgress, itemsInPocket);
    }

    public void restore(Object pm){
        PlayerMomento momento = (PlayerMomento)pm;
        health = momento.healthMomento;
        gameProgress = momento.gameProgressMomento;
        itemsInPocket = momento.itemsInPocketMomento;
    }
    @Override
    public String toString() {
        return "Player health: " + health + ", gameProgress: " + gameProgress + ", itemsInPocket: " + itemsInPocket;
    }

    private class PlayerMomento {
        int healthMomento;
        int gameProgressMomento;
        List<Items> itemsInPocketMomento;

        public PlayerMomento(int healthMomento,
                             int gameProgressMomento,
                             List<Items> itemsInPocketMomento) {

            this.healthMomento = healthMomento;
            this.gameProgressMomento = gameProgressMomento;
            this.itemsInPocketMomento = itemsInPocketMomento;
        }
    }
}

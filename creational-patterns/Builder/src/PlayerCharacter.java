public class PlayerCharacter {
    private String name;
    private Weapons weapon;
    private Armor armor;
    private int health;
    private int strength;

    public void setHealth(int health){
        this.health = health;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeapon(Weapons weapon){
        this.weapon = weapon;
    }
    public void setArmor(Armor armor){
        this.armor = armor;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "PlayerCharacter {" + "name='" + name + '\'' + ", weapon=" + weapon + ", armor=" + armor + ", health=" + health + ", strength=" + strength + '}';
    }
}
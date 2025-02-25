public class WarriorCharacterBuilder implements CharacterBuilder {
    private PlayerCharacter playerCharacter;

    public WarriorCharacterBuilder(String name) {
        playerCharacter = new PlayerCharacter();
        playerCharacter.setName(name);
    }

    @Override
    public void buildWeapon() {
        playerCharacter.setWeapon(Weapons.sword);
    }

    @Override
    public void buildArmor() {
        playerCharacter.setArmor(Armor.ironWolf);
    }

    @Override
    public void buildStrength() {
        playerCharacter.setStrength(30);
    }

    @Override
    public void buildHealth(){
        playerCharacter.setHealth(150);
    }

    @Override
    public PlayerCharacter build() {
        return playerCharacter;
    }

}

public class MageCharacterBuilder implements CharacterBuilder {
    private PlayerCharacter playerCharacter;

    public MageCharacterBuilder(String name) {
        playerCharacter = new PlayerCharacter();
        playerCharacter.setName(name);
    }

    @Override
    public void buildWeapon() {
        playerCharacter.setWeapon(Weapons.magicBook);
    }

    @Override
    public void buildArmor() {
        playerCharacter.setArmor(Armor.shadowWalker);
    }

    @Override
    public void buildStrength() {
        playerCharacter.setStrength(5);
    }

    @Override
    public void buildHealth(){
        playerCharacter.setHealth(120);
    }

    @Override
    public PlayerCharacter build() {
        return playerCharacter;
    }
}
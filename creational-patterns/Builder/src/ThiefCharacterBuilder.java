public class ThiefCharacterBuilder implements CharacterBuilder {
    private PlayerCharacter playerCharacter;

    public ThiefCharacterBuilder(String name){
        playerCharacter = new PlayerCharacter();
        playerCharacter.setName(name);
    }

    @Override
    public void buildWeapon(){
        playerCharacter.setWeapon(Weapons.knife);
    }

    @Override
    public void buildArmor(){
        playerCharacter.setArmor(Armor.greatAegis);
    }

    @Override
    public void buildStrength(){
        playerCharacter.setStrength(10);
    }

    @Override
    public void buildHealth(){
        playerCharacter.setHealth(100);
    }
    public PlayerCharacter build(){
        return playerCharacter;
    }
}

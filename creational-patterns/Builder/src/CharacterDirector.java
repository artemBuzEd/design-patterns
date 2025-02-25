public class CharacterDirector {
    private CharacterBuilder characterBuilder = null;

    public CharacterDirector(CharacterBuilder characterBuilder){
        this.characterBuilder = characterBuilder;
    }

    public void constructCharacter(){
        characterBuilder.buildArmor();
        characterBuilder.buildStrength();
        characterBuilder.buildWeapon();
        characterBuilder.buildHealth();
    }

    public PlayerCharacter getCharacter(){
        return characterBuilder.build();
    }
}

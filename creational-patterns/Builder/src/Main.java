public class Main {
    public static void main(String[] args){
        CharacterBuilder thiefBuilder = new ThiefCharacterBuilder("Steve The Greater Thief");
        CharacterDirector thiefDirector = new CharacterDirector(thiefBuilder);
        thiefDirector.constructCharacter();
        PlayerCharacter thief = thiefDirector.getCharacter();
        System.out.println("Thief: " + thief);

        CharacterBuilder warriorBuilder = new WarriorCharacterBuilder("John Unbeatable");
        CharacterDirector warriorDirector = new CharacterDirector(warriorBuilder);
        warriorDirector.constructCharacter();
        PlayerCharacter warrior = warriorDirector.getCharacter();
        System.out.println("Warrior: " + warrior);

        CharacterBuilder mageBuilder = new MageCharacterBuilder("Gendalv");
        CharacterDirector mageDirector = new CharacterDirector(mageBuilder);
        mageDirector.constructCharacter();
        PlayerCharacter mage = mageDirector.getCharacter();
        System.out.println("Mage: " + mage);
    }
}

package w02_klass.Game;

public class Character {
    private int x;
    private int y;

    private String name;
    private CharacterType characterType;
    private Direction direction;

    String slogan = "";

    public Character(String name, CharacterType characterType){
        this.characterType = characterType;
        this.name = name;

        this.x = 30;
        this.y = 30;

    }

    @Override
    public String toString() {
        return "My name is: "+name+" and i am at x: "+this.x + " y: " + this.y;
    }
}

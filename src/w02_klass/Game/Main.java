package w02_klass.Game;

public class Main {
    public static void main(String[] args){

        Character me = new Character("Andreas",CharacterType.GOBLIN);
        me.slogan = "A";
        System.out.println(me);
    }
}

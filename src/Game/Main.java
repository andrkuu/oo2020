import Renderer.ConsoleRenderer;
import world.*;
import world.Character;

import java.util.Scanner;

public class Main {



    public static void main(String[] args){

        Character me = new Character("Andreas", CharacterType.WARRIOR, new Position(0,0));
        Character enemy = new Character("Goblin",world.CharacterType.GOBLIN, new Position(0,1));

        WorldMap world = new WorldMap();
        world.addCharacter(me);
        world.addCharacter(enemy);

        ConsoleRenderer renderer = new ConsoleRenderer();
        renderer.renderGame();

        String input = "";
        Scanner scanner = new Scanner(System.in);

        while(input != "exit"){

            input = scanner.nextLine();
            renderer.clearScreen();
            renderer.renderGame();
            switch (input.toLowerCase()){
                case "w":
                    me.move(Direction.UP);
                    break;
                case "s":
                    me.move(Direction.DOWN);
                    break;
                case "a":
                    me.move(Direction.LEFT);
                    break;
                case "d":
                    me.move(Direction.RIGHT);
                    break;

            }
        }

        /*
        world.Character me = new world.Character("Andreas",world.CharacterType.WARRIOR, new world.Position(0,0));

        world.Character enemy = new world.Character("Goblin",world.CharacterType.GOBLIN, new world.Position(0,1));

        System.out.println(me.position);
        me.move(world.Direction.LEFT);
        me.move(world.Direction.RIGHT);
        System.out.println(me.position);

        Scanner scanner = new Scanner(System.in);
        String input = "";
        int inChar;



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

    }
}

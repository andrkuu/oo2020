

import Renderer.ConsoleRenderer;
import items.Item;
import items.ItemMaterial;
import items.ItemType;
import world.*;
import world.Character;

import java.util.Scanner;

public class Main {



    public static void main(String[] args){

        Character player = new Character("Andreas", CharacterType.WARRIOR, new Position(0,0),"O");
        Character enemy = new Character("Goblin",world.CharacterType.GOBLIN, new Position(3,3),"X");

        WorldMap world = new WorldMap(20,10);
        world.addCharacter(player);
        world.addCharacter(enemy);

        Item[] items = new Item[2];

        items[0] = new Item("Shield", ItemType.SHIELD, ItemMaterial.BRONZE,5.0);

        String input = "";
        Scanner scanner = new Scanner(System.in);

        world.render();
        while(!input.equals("end")){
            input = scanner.nextLine();

            if (input.equals("")){
                player.move();
            } else if (input.equals("w")){
                player.changeDirection(Direction.UP);
            } else if (input.equals("s")){
                player.changeDirection(Direction.DOWN);
            } else if (input.equals("a")){
                player.changeDirection(Direction.LEFT);
            } else if (input.equals("d")){
                player.changeDirection(Direction.RIGHT);
            }

            if(player.position.x == enemy.position.x && player.position.y == enemy.position.y){
                enemy.isVisible = enemy.isVisible == true ? false : true;
            }

            world.render();
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

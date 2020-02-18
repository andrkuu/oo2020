import items.*;
import javafx.scene.transform.Scale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Character me = new Character("Andreas",CharacterType.WARRIOR, new Position(0,0));

        Character enemy = new Character("Goblin",CharacterType.GOBLIN, new Position(0,1));

        System.out.println(me.position);
        me.move(Direction.LEFT);
        me.move(Direction.RIGHT);
        System.out.println(me.position);

        Scanner scanner = new Scanner(System.in);
        String input = "";
        int inChar;

        BufferedReader buffer = new BufferedReader(
                new InputStreamReader(System.in));
        int c = 0;
        while(true) {
            try {
                if (!((c = buffer.read()) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            char character = (char) c;
            System.out.println(character);
        }


    }
}

package world;

import sections.WorldSection;

import java.util.ArrayList;

public class WorldMap {


    private ArrayList<Character> worldCharacters = new ArrayList<>();
    private ArrayList<MapTile> mapTiles = new ArrayList<>();

    public WorldMap(){


        int worldX = 32;
        int worldY = 32;



    }

    public void addCharacter(Character c){
        worldCharacters.add(c);
    }

}

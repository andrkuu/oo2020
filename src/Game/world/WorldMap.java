package world;

import sections.WorldSection;

import java.awt.*;
import java.util.ArrayList;

public class WorldMap {


    public ArrayList<Character> worldCharacters = new ArrayList<>();
    private ArrayList<MapTile> mapTiles = new ArrayList<>();

    public WorldMap(){

        int worldX = 32;
        int worldY = 32;

    }

    public void drawCharacters(Graphics g){
        for (Character c: worldCharacters) {
            int posX = c.position.x*10;
            int posY = c.position.y*10;
            g.setColor(Color.black);
            g.fillRect(posX, posY, 45, 45);
            g.setColor(Color.BLUE);
            g.drawString(c.getName(), posX,posY-20);
        }
    }

    public void updateWorld(Graphics g){
        drawCharacters(g);

    }

    public void addCharacter(Character c){
        worldCharacters.add(c);
    }

}

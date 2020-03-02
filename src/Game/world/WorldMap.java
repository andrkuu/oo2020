package world;

import sections.WorldSection;

import java.awt.*;
import java.util.ArrayList;

public class WorldMap {


    private ArrayList<Character> worldCharacters = new ArrayList<>();
    private ArrayList<MapTile> mapTiles = new ArrayList<>();

    private int width;
    private int height;

    public WorldMap(int width, int height){

        this.width = width;
        this.height = height;


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

    public void render(){
        restrict();

        String symbol = "";

        for(int y = 0; y <= height; y++){
            for(int x = 0; x <= width; x++){
                if (y == 0 || y == height){
                    symbol = "-";
                } else if (x == 0 || x == width){
                    symbol = "|";
                } else {
                    symbol = " ";
                }

                for (Character c : worldCharacters){
                    if (c.isVisible && c.position.x == x && c.position.y == y){
                        symbol = c.getSymbol();
                    }
                }

                System.out.print(symbol);
            }

            System.out.println("");
            symbol = "";
        }
    }

    void restrict(){
        Character c = worldCharacters.get(worldCharacters.size()-1);

        if (c.position.x == 0){
            c.position.x++;
        } else if (c.position.y == 0){
            c.position.y++;
        } else if (c.position.x == width){
            c.position.x--;
        } else if (c.position.y == height){
            c.position.y--;
        }
    }

}

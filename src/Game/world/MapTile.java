package world;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MapTile {

    private Map<TileType, Color> tiles;


    MapTile(TileType type, Scale scale, Color c){
        tiles = new HashMap<>();

        tiles.put(TileType.GRASS,Color.GREEN);
        tiles.put(TileType.DIRT,Color.orange);

    }

}

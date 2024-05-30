import java.util.ArrayList;
import java.util.List;

public class World {

    private int worldSize;
    private Cell[][] worldMap;

    public World(int worldSize){
        this.worldSize = worldSize;
        this.worldMap = new Cell[worldSize][worldSize];
        layWorld(worldSize);
    }

    public int getWorldSize(){
        return this.worldSize;
    }

    private void layWorld(int worldSize){
        for (int x = 0; x < worldSize; x++){
            for (int y = 0; y < worldSize; y++){
                worldMap[x][y] = new Cell('.', x, y);
            }
        }
    }

}

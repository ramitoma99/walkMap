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
                worldMap[y][x] = new Cell('.', x, y);
            }
        }
    }

    public void displayWorld(){
        for (int x = 0; x < worldSize; x++){
            for (int y = 0; y < worldSize; y++){
                System.out.print(worldMap[y][x].getCellContent() + "\t");
            }
            System.out.println();
        }
    }

    public void setCell(char init, int x, int y) {
        worldMap[x][y].setPosX(x);
        worldMap[x][y].setPosY(y);
        worldMap[x][y].setCellContent(init);
    }

}

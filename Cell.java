public class Cell {

    private char cellContent;
    private int posX;
    private int posY;
    private int sharedByPlayers = 0;

    public Cell(char content, int x, int y){
        this.cellContent = content;
        this.posX = x;
        this.posY = y;
    }

    public char getCellContent(){
        return this.cellContent;
    }

    public void setCellContent(char new_content){
        this.cellContent = new_content;
    }

    public int getPosX(){
        return this.posX;
    }

    public void setPosX(int new_x){
        this.posX = new_x;
    }

    public int getPosY(){
        return this.posY;
    }

    public void setPosY(int new_y){
        this.posY = new_y;
    }

    public int getSharedByPlayers(){
        return this.sharedByPlayers;
    }

    public void setSharedByPlayers(int new_sharedByPlayers){
        this.sharedByPlayers = new_sharedByPlayers;
    }

}
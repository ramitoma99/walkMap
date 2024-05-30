public class Player {

    private char initial;
    private int posX;
    private int posY;

    public Player(char initial, int posX, int posY){
        this.initial = initial;
        this.posX = posX;
        this.posY = posY;
    }

    public char getInitial(){
        return this.initial;
    }

    public void setInitial(char new_name){
        this.initial = new_name;
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

    public void spawnMeInWorld(char initial){
        
    }
}

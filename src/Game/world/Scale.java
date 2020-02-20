package world;

public class Scale {

    public int x;
    public int y;

    public Scale(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "X: " + this.x + " Y: " + this.y;
    }
}

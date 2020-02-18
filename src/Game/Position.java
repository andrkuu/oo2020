public class Position {

    public int x;
    public int y;

    Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "X: " + this.x + " Y: " + this.y;
    }
}
